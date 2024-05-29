import java.util.Scanner;

class EIPOINT_DIEMSO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var score = sc.nextInt();
        var grades = new int[] { 90, 85, 80, 75, 70, 65, 60, 55, 53, 52, 50, 0 };
        var gradeLetters = new String[] { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F", };
        for (var i = 0; i < grades.length; i++) {
            if (score >= grades[i]) {
                System.out.println(gradeLetters[i]);
                break;
            }
        }
        sc.close();
    }
}
