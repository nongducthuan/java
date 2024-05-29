import java.util.Scanner;

class EIGROSS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] afterTax = new float[n];
        double tax = 0;
        for (int i = 0; i < n; i++) {
            afterTax[i] = sc.nextFloat();
        }
        for (int i = 0; i < n; i++) {
            double beforeTax = afterTax[i] / 0.9 ;
            tax = 0.1 * beforeTax;
            System.out.println((float)tax);
        }
        sc.close();
    }
}
