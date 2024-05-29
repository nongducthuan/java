import java.util.Scanner;

class EIUSAVING2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var month = sc.nextInt();
        double totalSaving = 0;
        for (var i = 0; i < month; i++){
            var saving = sc.nextDouble();
            totalSaving += calculateSaving (saving, month - i);
        }
        System.out.println(Math.round(totalSaving));
        sc.close();
    }
        static double[] interests = new double[] { 0, 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614,
            0.0638, 0.0664, 0.0692 };
        static double calculateSaving(double value, int month){
        var year = month / 12;
        month = month % 12;
        return value = value * Math.pow(1 + interests[12], year) * (1 + interests[month] / 12 * month);
        }
}