import java.util.Scanner;

class EIUMARKUP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int price = 200; 
        int total = 0; 
        for (int i = 0; i < n; i++) {
            if (i % 100 == 0 && i > 0) {
                price--;
            }
            price = Math.max(price, 180);
            total += price;
        }
        System.out.println(total);
        sc.close();
    }
}
