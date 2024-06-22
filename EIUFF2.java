import java.util.Scanner;

class EIUFF2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double f = sc.nextDouble();
        int C = sc.nextInt();
        double minimumAmount = C / (r - f) * 100;
        System.out.println((int)Math.ceil(minimumAmount));
        sc.close();
    }
}
