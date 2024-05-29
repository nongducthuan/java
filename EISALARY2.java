import java.util.Scanner;

class EISALARY2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        double totalOvertimeHours = 0;
        double overtimeWages = 0;
        double totalHours = 0;
        double totalWages = 0;
        double totalWagesNotOvertime = 0;
        double totalHoursNotOvertime = 0;
        for (int i = 0; i < n; i++) {
            double overtimeHours = 0;
            double hoursNotOvertime = 0;
            for (int j = 0; j < 5; j++) {
                double hour = sc.nextDouble();
                if (hour <= 8) {
                    hoursNotOvertime += hour;
                } else {
                    overtimeHours += (hour - 8);
                    hoursNotOvertime += 8;
                }
            }
            double wage = sc.nextDouble();
            totalHours = hoursNotOvertime + overtimeHours * 1.5;
            totalWages = totalHours * wage;
            overtimeWages += overtimeHours * wage * 1.5;
            totalWagesNotOvertime += hoursNotOvertime * wage;
            totalOvertimeHours += overtimeHours;
            totalHoursNotOvertime += hoursNotOvertime;
            sb.append(totalWages).append("\n");
        }
        sb.append((double) Math.round((totalWagesNotOvertime / totalHoursNotOvertime) * 100) / 100).append("\n");
        sb.append((double) Math.round((overtimeWages / totalOvertimeHours) * 100) / 100);
        System.out.println(sb);
    }
}
