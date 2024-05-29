import java.util.Scanner;

class EIGPA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int total = 0;
        int average = 0;
        for (int i = 0; i < n; i++) {
            int grade = sc.nextInt();
            if (grade >= 50)
                total += grade;
            else
                m = n - 1;
        }
        average = total / m;
        System.out.println(average);
        sc.close();
    }
}
