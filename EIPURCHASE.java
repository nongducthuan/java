import java.util.Scanner;

class EIPURCHASE {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        int t = sc.nextInt();
        double n = sc.nextDouble();
        double g = sc.nextDouble();
        double x = v - n;
        double low = 0;
        double high = 1;
        while (high - low > 0.0000001) {
            double middle = (high + low) / 2;
            var debt = calculate(x, g, t, middle);
            if (debt > 0) {
                high = middle;
            } else {
                low = middle;
            }
        }
        System.out.printf("%.7f", low);
        sc.close();
    }
    static double calculate(double debt, double monthlyPay, int month, double r) {
        for (var i = 0; i < month; i++) {
            debt = debt * (1 + r) - monthlyPay;
        }
        return debt;
    }
}