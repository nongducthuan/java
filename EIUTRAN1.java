import java.util.Scanner;

class EIUTRAN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String reverseString = "";
        for (int i = b.length() - 1; i >= 0; i--) {
            reverseString = reverseString + b.charAt(i);
        }
        if (a.equalsIgnoreCase(reverseString))
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
