import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = isPrime(number, 2);

        System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));
    }

    private static boolean isPrime(int number, int divisor) {
        if (divisor == number) {
            return true;
        } else if (number % divisor == 0) {
            return false;
        } else {
            return isPrime(number, divisor + 1);
        }
    }
}
