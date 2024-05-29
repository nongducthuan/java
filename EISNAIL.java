import java.util.Scanner;

class EISNAIL_SNAIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt();
        int down = sc.nextInt();
        int height = sc.nextInt();
        int day = (height - down - 1) / (up - down) + 1;
        System.out.println(day);
        sc.close();
    }
}
