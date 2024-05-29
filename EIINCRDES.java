import java.util.Scanner;

class EIINCRDES_OrderOfTheSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        String result = check(array);
        System.out.println(result);
        scanner.close();
    }
    public static String check(int[] array) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                decreasing = false;
            } else if (array[i] < array[i - 1]) {
                increasing = false;
            } else if (array[i] == array[i - 1]) {
                increasing = false;
                decreasing = false;
            }
        }
        if (increasing) {
            return "increasing";
        } else if (decreasing) {
            return "decreasing";
        } else {
            return "none";
        }
    }
}
