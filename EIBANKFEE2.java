import java.util.Scanner;

class EIBANKFEE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] saveMoney = { 500, 2000, 5000, Long.MAX_VALUE };
        double[] fee0fMonth = { 12.00, 7.5, 5.00, 0.0 };
        double[] feeCheck = { 0.2, 0.2, 0.1, 0 };
        int account = sc.nextInt();
        int countCheck = 0;
        double fee = 0.0;
        for (int j = 0; j < account; j++) {
            double money = sc.nextDouble();
            int check = sc.nextInt();
            countCheck += check;
            for (int i = 0; i < 4; i++) {
                if (money < saveMoney[i]) {
                    fee += fee0fMonth[i] + check * feeCheck[i];
                    break;
                }
            }
        }
        System.out.println((double) Math.round(fee / countCheck * 1000) / 1000);
        sc.close();
    }
}