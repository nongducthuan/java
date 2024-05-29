import java.util.Scanner;

class EIBANKLOAN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();  
        long Y = sc.nextLong();  
        double r = sc.nextDouble(); 
        double monthlyInterestRate = r / 100 / 12;
        int month = 0;
        while (X > 0) {
            double interest = X * monthlyInterestRate;
            double principalPayment = Y - interest;
            X -= principalPayment;
            month++;
        }
        System.out.println(month);
        sc.close();
    }
}

