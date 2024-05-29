import java.util.Scanner;

class EIVCHR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double discount = 0;
        discount = 0.3 * n;
        if (discount <= 50000) {
            System.out.println(Math.round(n - discount));
        } else
            System.out.println(n - 50000);
        sc.close();
    }
}