import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

class EIMEMCARD {
    static Scanner sc = new Scanner(System.in);
    static long[] money_level = new long[] { 0, 1_000_000, 20_000_000, 50_000_000, 200_000_000, Long.MAX_VALUE };
    static double[] rate = new double[] { 0, 0.02, 0.03, 0.05, 0.07 };

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long n = sc.nextLong();
        long total = 0;
        for (int i = 0; i < n; i++) {
            long price = sc.nextLong();
            double discount = 0;
            for (int j = 1; j < money_level.length; j++) {
                if (total < money_level[j]) {
                    discount = (price * rate[j - 1]);
                    break;
                }
            }
            total += price;
            BigDecimal bigDecimalValue = BigDecimal.valueOf(discount);
            BigDecimal roundedValue = bigDecimalValue.setScale(2, RoundingMode.HALF_UP);
            double afterRoundedValue = roundedValue.doubleValue();
            if (afterRoundedValue - (long) discount > 0)
                sb.append(afterRoundedValue + " ");
            else
                sb.append((long) discount + " ");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
}
