import java.util.Scanner;

class EIUTHU_Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstPart = sc.nextLine();
        String secondPart = sc.nextLine();
        int length = Math.min(firstPart.length(), secondPart.length());
        int matching = 0;
        for (int i = 1; i <= length; i++) {
            if (firstPart.endsWith(secondPart.substring(0, i))) {
                matching = i;
            }
        }
        int shortest = firstPart.length() + secondPart.length() - matching;
        System.out.println(shortest);
        sc.close();
    }
}
