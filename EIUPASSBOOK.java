import java.util.Scanner;

class EIUPASSBOOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int n = sc.nextInt();
        int m = sc.nextInt();
        double r1 = sc.nextDouble() / 100;
        double r2 = sc.nextDouble() / 100;
        double y = (x * (1 + r1 / 12 * n)) / (Math.pow(1 + r2, (n - m) / 12) * (1 + r2 / 12 * ((n - m) % 12)));
        if (x > y)
            System.out.println(x);
        else
            System.out.println(Math.round(y));
        sc.close();
    }
}
