import java.util.Scanner;

class EIUBHOUSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        double n = sc.nextDouble();
        long m = sc.nextLong();
        long k = sc.nextLong();
        double x = sc.nextDouble() / 100;
        n -= m;
        double g = (double) n / k;
        for (int i = 1; i <= k; i++) {
            sb.append(i + " " + Math.round(g + n * x) + "\n");
            n -= g;
        }
        System.out.println(sb);
        sc.close();
    }
}
