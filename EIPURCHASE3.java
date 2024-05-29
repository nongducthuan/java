import java.util.Scanner;

class EIPURCHASE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var p = sc.nextInt();
        var m = sc.nextInt();
        var n = sc.nextInt();
        var r = sc.nextDouble();
        var a = p - m;
        var b = Math.pow((1 + r), n);
        var x = a * b / ((b - 1) / r);
        System.out.println((int) x);
        sc.close();
    }
}
