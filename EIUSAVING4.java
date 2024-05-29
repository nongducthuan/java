import java.util.Scanner;

class EIUSAVING4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] interests = new double[] { 0, 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614,
                0.0638, 0.0664, 0.0692 };
        int m = sc.nextInt();
        double P[] = new double[m];
        double total = 0;
        for (int i = 0; i < m; i++) {
            P[i] = sc.nextDouble();
        }
        for (int i = 0; i < m; i++) {
            var month = m - i;
            var year = month / 12;
            month = month % 12;
            P[i] = P[i] * Math.pow(1 + interests[12], year) * (1 + interests[month] / 12 * month);
            total += P[i];
        }
        System.out.println((long) Math.round(total));
        sc.close();
    }
}