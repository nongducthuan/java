import java.util.Scanner;

class EIUSAVING1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] interests = new double[] { 0, 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614,
                0.0638, 0.0664, 0.0692 };
        double P = sc.nextDouble();
        int m = sc.nextInt();
        var year = m / 12;
        m = m % 12;
        P = P * Math.pow(1 + interests[12], year) * (1 + interests[m] / 12 * m);
        P = Math.round(P);
        System.out.println((long) P);
        sc.close();
    }
}
