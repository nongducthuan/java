import java.util.Arrays;
import java.util.Scanner;

class EIEVERYN_EveryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var nTest = sc.nextInt();
        for (var t = 0; t < nTest; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            boolean[] flags = new boolean[m + 1];
            Arrays.fill(flags, false);
            for (var i = 0; i < n; i++) {
                var num = sc.nextInt();
                if (1 <= num && num <= m) {
                    flags[num] = true;
                }
            }
            var i = 1;
            for (i = 1; i <= m; i++) {
                if (!flags[i]) {
                    break;
                }
            }
            System.out.println(i == m + 1 ? "Yes" : "No");
        }
        sc.close();
    }
}