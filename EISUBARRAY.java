import java.util.Scanner;

class EISUBARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = 0;
        long sum = Long.MIN_VALUE;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= n - k; i++) {
            int total = 0;
            for (int j = i; j < k + i; j++) {
                total += arr[j];
                max = total;
            }
            if (sum < max)
                sum = max;
        }
        System.out.println(sum);
        sc.close();
    }
}
