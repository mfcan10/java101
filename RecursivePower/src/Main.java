import java.util.Scanner;
public class Main {
    private static int exponentiation(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * exponentiation(base, exp - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a base number: ");
        int base = scanner.nextInt();
        System.out.println("Enter an exponent number: ");
        int exp = scanner.nextInt();

        int result = exponentiation(base, exp);

        System.out.println("Result: " + result);
    }

}