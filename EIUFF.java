import java.util.Scanner;

class EIUFF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double f = sc.nextDouble();
        int Y = sc.nextInt();
        int N = sc.nextInt();
        double X = 0.0;
        double monthlyWithdrawal = Y;
        for (int i = 1; i < N; i++) {
            X += monthlyWithdrawal / Math.pow(1 + r / 100, i);
            monthlyWithdrawal *= (1 + f / 100);
        }
        System.out.printf("%.4f", X);
        sc.close();
    }
}