import java.util.Scanner;

class EIUINV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long y = sc.nextLong();
        long[] arr = new long[12];
        for (int i = 0; i < 12; i++) {
            arr[i] = sc.nextLong();
        }
        double answer = 0;
        double high = 1;
        double low = 0;
        while (high - low > 0.0000000001) {
            double middle = (high + low) / 2;
            answer = 0;
            for (int i = 0; i < 12; i++) {
                answer += arr[i] * Math.pow(1 + middle, 11 - i);
            }
            if (answer > y) {
                high = middle;
            } else {
                low = middle;
            }
        }
        System.out.printf("%.3f", low);
        sc.close();
    }
}
