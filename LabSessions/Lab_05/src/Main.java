import java.util.*;
import java.io.*;
public class Main {
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toUpperCase(ch));
            }
        }

        int len = sb.length();
        for (int i = 0; i < len / 2; i++) {
            if (sb.charAt(i) != sb.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void readints(String fileName) throws FileNotFoundException {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            int count = 0;
            int sum = 0;
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.print(num + " ");
                count++;
                sum += num;
            }
            System.out.println("\nCount of numbers: " + count);
            System.out.println("Sum of numbers: " + sum);
            System.out.printf("Average: %.2f\n", (double) sum / count);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found (" + fileName+")");
        }
    }
    public static double randomDoubles(int count, double lowerLimit, double upperLimit) {
        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            double randomNumber = Math.random() * (upperLimit - lowerLimit) + lowerLimit;
            System.out.printf("%.3f ", randomNumber);
            sum += randomNumber;
        }
        System.out.println();
        return sum;
    }
    public static void main(String[] args) throws IOException  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println("This string is a palindrome.");
        } else {
            System.out.println("This string is not a palindrome.");
        }
        readints("ints.txt");
        System.out.print("Enter count of numbers: ");
        int count = scanner.nextInt();

        System.out.print("Enter lower limit: ");
        double lowerLimit = scanner.nextDouble();

        System.out.print("Enter upper limit: ");
        double upperLimit = scanner.nextDouble();

        double sum = randomDoubles(count, lowerLimit, upperLimit);

        double average = sum / count;

        System.out.printf("Sum = %.3f \n",sum);
        System.out.printf("Average = %.3f",average);
    }
}