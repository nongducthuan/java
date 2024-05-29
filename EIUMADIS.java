import java.util.Scanner;

class EIUMADIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] number = new long[n];
        long minus = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (number[j] > number[i]){
                minus = number[j]-number[i];
                if (minus > max)
                max = minus;
                } else
                break;
            } 
        }
        System.out.println(max);
        sc.close();
    }
}
