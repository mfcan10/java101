import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        double[] numbers = new double[numElements];

        System.out.println("Enter " + numElements + " numbers (one per line):");
        for (int i = 0; i < numElements; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double harmonicMean = calculateHarmonicMean(numbers);
        System.out.println("Harmonic Mean: " + harmonicMean);
    }
    public static double calculateHarmonicMean(double[] numbers) {
        double sumOfReciprocals = 0.0;
        for (double number : numbers) {
            if (number <= 0) {
                System.out.println("Error: Cannot calculate harmonic mean for non-positive numbers.");
                return Double.NaN;
            }
            sumOfReciprocals += 1.0 / number;
        }
        return numbers.length / sumOfReciprocals;
    }
}