import java.util.Arrays;
import java.util.Scanner;

class EIUTRIGLE_NumberOfTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        Arrays.sort(number);
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n-1; j++) {
                for (int k = j + 1; k < n; k++){
                    if (number[i]+number[j]>number[k])
                    count ++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
