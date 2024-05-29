import java.util.Scanner;

class EIUSALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double total = 0;
        var sale = new long[] { 0, 20, 50, 200, 500, 2000, Long.MAX_VALUE };
        var rate = new double[] { 0, 0.02, 0.03, 0.04, 0.05, 0.06, 0.07 };
        for (int i = 6; i >= 0; i--) {
            if (n >= sale[i]) {
                total += (Math.min(sale[i + 1], n) - sale[i]) * rate[i + 1];
            }
        }
        System.out.print((double) Math.round(total * 1000) / 1000);
        sc.close();
    }
}
