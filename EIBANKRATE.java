import java.util.Scanner;

class EIBANKRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long money = sc.nextLong();
        int month = sc.nextInt();
        double interestRate = money * 0.09/12 * month;
        System.out.println((money + interestRate));
        sc.close();
    }
}
