import java.util.Scanner;

class EITAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long salary = sc.nextLong();
        long remainingSalary = salary - 9000000;
        double tax = 0;
        long[] money_level = new long[] { 0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000, Long.MAX_VALUE };
        double[] rate = new double[] { 0, 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
        if (salary < 9000000)
            System.out.println(0);
        else {
            for (int i = 6; i >= 0; i--) {
                if (remainingSalary >= money_level[i])
                    tax += (Math.min(money_level[i + 1], remainingSalary) - money_level[i]) * rate[i + 1];
            }
                System.out.println(Math.round(tax));
        }
        sc.close();
    }
}
