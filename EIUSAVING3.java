import java.util.Scanner;

class EIUSAVING3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var money = sc.nextLong();
        var month = sc.nextInt();
        double totalSaving = calculateSaving(money, month);
        System.out.printf("%.4f",totalSaving);
        sc.close();
    }
    static double[] interests = new double[] { 0, 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614,
            0.0638, 0.0664, 0.0692 };
    static double calculateSaving(double money, int month) {
        var year = 0;
        var temp = 0;
        double interest = 0;
        double deposit = 0;
        while (month > 0) {
            year = month / 12;
            temp = month % 12;
            interest += Math.pow(1 + interests[12], year) * (1 + interests[temp] / 12 * temp);
            month--;
        }
        deposit = money / interest;
        return deposit;
    }
}