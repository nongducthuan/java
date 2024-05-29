import java.util.Scanner;

class EIUBIRTH_QuaSinhNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long testcase = sc.nextLong();
        for (long i = 1; i <= testcase; i++) {
            long numGreen = sc.nextInt();
            long numRed = sc.nextInt();
            long priceGreen = sc.nextInt();
            long priceRed = sc.nextInt();
            long priceChange = sc.nextInt();
            long minCost = Math.min(priceGreen, priceRed + priceChange) * numGreen
                    + Math.min(priceRed, priceGreen + priceChange) * numRed;
            System.out.println(minCost);
        }
        sc.close();
    }
}

