import java.util.Scanner;

class EIBANKFEE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] saveMoney = { 500, 2000, 5000, Long.MAX_VALUE };
        double[] fee0fMonth = { 12.00, 7.5, 5.00, 0.0 };
        double[] feeCheck = { 0.2, 0.2, 0.1, 0 };
        double money = sc.nextDouble();
        int check = sc.nextInt();
        double fee = 0.0;
        for (int i = 0; i < 4; i++) {
            if (money < saveMoney[i]) {
                fee = fee0fMonth[i] + check * feeCheck[i];
                break;
            }
        }
        System.out.println((double) fee);
        sc.close();
    }
}