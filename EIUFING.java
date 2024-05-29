import java.util.Scanner;

class EIUFING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n % 18;
        if (n > 10)
            n = 20 - n;
        if (n == 10) {
            System.out.println("Ngon cai cua ban tay phai");
        }
        if (n == 9) {
            System.out.println("Ngon tro cua ban tay phai");
        }
        if (n == 8) {
            System.out.println("Ngon giua cua ban tay phai");
        }
        if (n == 7) {
            System.out.println("Ngon ap ut cua ban tay phai");
        }
        if (n == 6) {
            System.out.println("Ngon ut cua ban tay phai");
        }
        if (n == 5) {
            System.out.println("Ngon ut cua ban tay trai");
        }
        if (n == 4) {
            System.out.println("Ngon ap ut cua ban tay trai");
        }
        if (n == 3) {
            System.out.println("Ngon giua cua ban tay trai");
        }
        if (n == 2) {
            System.out.println("Ngon tro cua ban tay trai");
        }
        if (n == 1) {
            System.out.println("Ngon cai cua ban tay trai");
        }
        sc.close();
    }
}