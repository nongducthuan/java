import java.util.Scanner;

class CHITEST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            float total = 0;
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            total = a + b;
            sb.append(total).append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}
