import java.util.Scanner;

class EIDISCOU2_DISCOUNT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        var money_level = new long[] { 5000000, 20000000, 100000000, 300000000, 600000000, 900000000, Long.MAX_VALUE };
        var rate = new double[] { 0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };
        for (int i = 6; i >= 0; i--) {
            if (money >= money_level[i]) {
                money -= (Math.min(money_level[i + 1], money) - money_level[i]) * rate[i + 1];
            }
        }
        System.out.println(money);
        sc.close();
    }
}