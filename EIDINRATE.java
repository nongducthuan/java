import java.util.Scanner;
class EIDINRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt(); 
        for (int i = 0; i < testCases; i++) {
            double money = sc.nextDouble(); 
            double interestRate = sc.nextDouble(); 
            double total = sc.nextDouble(); 
            int years = 0;
            while (money < total) {
                money += money * interestRate / 100;
                years ++;
            }
            System.out.println(years);
        }
    sc.close();
    }
}

