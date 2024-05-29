import java.util.Scanner;

class EICLEANU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long total = 0;
        for (int i = 0; i < n; i++) {
            int step = sc.nextInt();
            total += step;
        }
        System.out.println(total * 2);
        sc.close();
    }
}
