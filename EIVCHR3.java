import java.util.*;

class EIVCHR3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int voucher = sc.nextInt();
        double discount = 0;
        long total = 0;
        long[] item = new long[n];
        for (int i = 0; i < n; i++) {
            item[i] = sc.nextLong();
        }
        Arrays.sort(item);
        if (n > voucher) {
            for (int i = 0; i < n - voucher; i++) {
                total += item[i];
            }
            for (int i = n - voucher; i < n; i++) {
                discount = Math.min(0.3 * item[i], 50000);
                total += item[i] - discount;
            }
        } else 
            for (int i = 0; i < n; i++) {
                discount = Math.min(0.3 * item[i], 50000);
                total += item[i] - discount;
            }
        System.out.println(total);
        sc.close();
    }
}
