import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter n: ");
        long n = scanner.nextInt();

        System.out.print("Please enter r: ");
        long r = scanner.nextInt();

        if (n < r) {
            System.out.println("N must be greater than or equal to the R");
            return;
        }

        long comb = faktH(n) / (faktH(r) * faktH(n - r));

        System.out.println("C("+n+","+r+") = " + comb);
    }

    private static long faktH(long number) {
        long fakt = 1;
        for (long i = 1; i <= number; i++) {
            fakt *= i;
        }
        return fakt;
    }
}