import java.util.Scanner;
class EIGROSS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long salary = sc.nextLong();
        System.out.println(Math.round(calculateNetSalary(salary)));
        sc.close();
    }
    public static long M = 1000000;
    public static long[] taxLevels = { 0, 11 * M, 16 * M, 21 * M, 29 * M, 43 * M, 63 * M, 91 * M,
            Long.MAX_VALUE };
    public static double[] taxRates = { 0, 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
    public static double calculateNetSalary(double grossSalary) {
        double netSalary = 0;
        for (int i = 0; i < taxRates.length; i++) {
            double newNetSalary = netSalary + (taxLevels[i + 1] - taxLevels[i]) * (1 - taxRates[i]);
            if (newNetSalary >= grossSalary) {
                netSalary = taxLevels[i] + (grossSalary - netSalary) / (1 - taxRates[i]);
                break;
            } else {
                netSalary = newNetSalary;
            }
        }
        return netSalary;
    }
}


