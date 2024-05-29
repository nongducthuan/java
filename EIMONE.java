import java.util.Scanner;

class EIMONE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var money = sc.nextInt();
        int number = 0;
        int[] paper = new int[] { 20, 10, 5, 1 };
        for (var i = 0; i < paper.length; i++) {
            if (money >= paper[i]) {
                number = money / paper[i];
                money = money % paper[i];
                System.out.println(paper[i] + " " + number);
            }
        }
        sc.close();
    }
}