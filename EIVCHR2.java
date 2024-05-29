import java.util.*;

class EIVCHR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double discount = 0;
        long total = 0;
        long[] item = new long[n];
        for (int i = 0; i < n; i++) {
            item[i] = sc.nextLong();
        }
        Arrays.sort(item);
        for (int i = 0; i < n - 1; i++) {
            total += item[i];
        }
        discount = 0.3 * item[n - 1];
        if (discount <= 50000)
            total += item[n - 1] - discount;
        else
            total += item[n - 1] - 50000;
        System.out.println(total);
        sc.close();
    }
}