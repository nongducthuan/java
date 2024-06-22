import java.util.Scanner;

class EIVINFASTBATTERY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long car = sc.nextLong();
        long battery = sc.nextLong();
        long month = sc.nextLong();
        double rate = sc.nextDouble() / 100;
        double presentValueOfBattery = battery / Math.pow(1 + rate, month);
        double netCost = car - presentValueOfBattery;
        double annuityFactor = (1 - Math.pow(1 + rate, -month)) / rate;
        System.out.println(Math.round(netCost / annuityFactor));
        sc.close();
    }
}
