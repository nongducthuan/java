import java.util.Scanner;

class EIAUCTION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j])
                    count++;
            }
            if (count == 1 && a[i] > max) 
                max = a[i];
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                System.out.println(i + 1);
                break;
            } else if (max == 0) {
                System.out.println("none");
                break;
            }
        }
        sc.close();
    }
}
