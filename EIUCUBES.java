import java.util.Scanner;

class EIUCUBES_BuildingPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int brick = 0;
        int layer = 0;
        int total = 0;
        while (total <= n) {
            layer += 1;
            brick += layer;
            total += brick;
            if (total > n)
                layer = layer - 1;
        }
        System.out.print(layer + " ");
        sc.close();
    }
}
