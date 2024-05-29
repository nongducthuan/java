import java.util.Arrays;
import java.util.Scanner;

class EIFREEZER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int bc = 0;
        int min = l + 2;
        int[] arr = new int[3];
        for (int i = 1; i <= l; i++) {
            if (l % i == 0) {
                a = l / i;
                bc = l / a;
                for (int j = 1; j <= bc; j++) {
                    if (bc % j == 0) {
                        b = bc / j;
                        c = bc / b;
                        if ((a + b + c) <= min) {
                            min = a + b + c;
                            arr[0] = a;
                            arr[1] = b;
                            arr[2] = c;
                        }
                    }
                }
            }
        }
        Arrays.sort(arr);
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[3 - i] + " ");
        }
        sc.close();
    }
}