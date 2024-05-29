import java.util.Scanner;

 class EIGRADE {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] name = new String[n];
        int[][] point = new int[n][m];
        int[] grade = { 90, 85, 80, 75, 70, 65, 60, 55, 53, 52, 50, 0 };
        String[] letter = { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            for (int j = 0; j < m; j++) {
                point[i][j] = sc.nextInt();
            }
        }
        String answer = "";
        double average = 0;
        String printPoint = "";
        for (int i = 0; i < n; i++) {
            answer = "";
            average = 0;
            printPoint = "";
            for (int j = 0; j < m; j++) {
                average += point[i][j];
                printPoint += point[i][j] + " ";
            }
            average = average / m;
            for (int j = 0; j < grade.length; j++) {
                if (average >= grade[j]) {
                    answer = letter[j];
                    break;
                }
            }
            answer = name[i] + " " + printPoint + (int)average + " " + answer;
            sb.append(answer + "\n");
        }
        System.out.println(sb);
        sc.close();
    }
}