import java.util.Scanner;
class EIGROSS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long salary = sc.nextLong();
        System.out.println(Math.round(gross(salary)));
        sc.close();
    }
    public static long M = 1000000;
    public static long[] taxLevels = { 0, 11 * M, 16 * M, 21 * M, 29 * M, 43 * M, 63 * M, 91 * M,
            Long.MAX_VALUE };
    public static double[] taxRates = { 0, 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
    public static double calculateTax(double salary) {
        double tax = 0;
        for (int i = 0; i < taxLevels.length; i++) {
            if (salary >= taxLevels[i]) {
                tax += (Math.min(taxLevels[i + 1], salary) - taxLevels[i]) * taxRates[i];
            }
        }
        return salary - tax;
    }
    public static double gross(double netSalary) {
        double low = 0;
        double high = Long.MAX_VALUE;
        while (high - low > 0.001) {
            var middle = (high + low) / 2;
            var temp = calculateTax(middle);
            if (temp < netSalary) {
                low = middle;
            } else {
                high = middle;
            }
        }
        return low;
    }
}


