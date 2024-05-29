import java.util.Scanner;

class EIINTEREST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bankRate = sc.nextDouble();
        int[] deposits = new int[12];
        for (int i = 0; i < 12; i++) {
            deposits[i] = sc.nextInt();
        }
        double totalSavings = 0;
        for (int deposit : deposits) {
            totalSavings += deposit;
            totalSavings *= (1 + bankRate);
        }
        System.out.println((long)totalSavings);
        sc.close();
    }
}

