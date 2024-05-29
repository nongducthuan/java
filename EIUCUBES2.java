import java.util.Scanner;

class EIUCUBES2_BuildingPyramid2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long n = sc.nextInt();
        long layer = 0;
        for (int i = 0; i < n; i++) {
            double total_bricks = sc.nextDouble();
            layer = (long) Math.cbrt(total_bricks * 6);
            long sum = (layer) * (layer + 1) * (layer + 2) / 6;
            if (sum <= total_bricks) {
                sb.append(layer).append(" ");
            }
            if (sum > total_bricks) {
                sb.append(layer - 1).append(" ");
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
