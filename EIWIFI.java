import java.util.Scanner;

class EIWIFI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long row = sc.nextLong();
            long column = sc.nextLong();
            long newRow = row - 2;
            long newColumn = column - 2;
            long a = newRow / 3;
            long b = newColumn / 3;
            long total = 0;
            if (newRow % 3 != 0 && newRow >= 0){
                a += 1;
            } 
            if (newColumn % 3 != 0 && newColumn >= 0){
                b += 1;
            }
            total = a * b;
            sb.append(total).append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}