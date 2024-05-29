import java.util.Scanner;

class EIABOVEA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = 0;
        double average = 0;
        long count = 0;
        long [] number = new long[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextLong();
            total += number[i];
        }
        average = total / n;
        for (int i = 0; i < n; i++) {
            if (number[i] > average)
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
