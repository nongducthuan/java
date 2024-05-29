import java.util.Scanner;

class EIPURCHASE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var v = sc.nextInt();
        var t = sc.nextInt();
        var n = sc.nextInt();
        var m = sc.nextInt();
        var x = v - n;
        double debt = 0;
        double answer = 0;
        for (double r = 0; r < 1; r += 0.00001) {
            debt = x * Math.pow((1 + r), t) - m * (Math.pow((1 + r), t) - 1) / r;
            if (debt >= 0) {
                answer = r;
                break;
            }
        }
        System.out.printf("%.3f", answer);
        sc.close();
    }
}