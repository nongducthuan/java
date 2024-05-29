import java.util.Scanner;

class EIINT21222MQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 25) {
            System.out.println("NO");
        } else {
            long digit1 = n % 10;
            String s = String.valueOf(n);
            StringBuilder sb = new StringBuilder(s);
            String new_s = sb.reverse().toString();
            long m = Long.valueOf(new_s);
            long digit2 = m % 10;
            String a = digit2 + "" + digit1;
            long b = Long.valueOf(a);
            if (n % b == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
