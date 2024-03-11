import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    additionOperation(scanner);
                    break;
                case 2:
                    subtractionOperation(scanner);
                    break;
                case 3:
                    multiplicationOperation(scanner);
                    break;
                case 4:
                    divisionOperation(scanner);
                    break;
                case 5:
                    exponentiationOperation(scanner);
                    break;
                case 6:
                    factorialCalculation(scanner);
                    break;
                case 7:
                    moduloOperation(scanner);
                    break;
                case 8:
                    rectangleAreaAndPerimeterCalculation(scanner);
                    break;
                case 9:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 9);
    }

    private static void printMenu() {
        System.out.println("Calculator");
        System.out.println("--------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Factorial Calculation");
        System.out.println("7. Modulo Operation");
        System.out.println("8. Rectangle Area and Perimeter Calculation");
        System.out.println("9. Exit");
        System.out.println("--------------");
        System.out.println("Your choice: ");
    }

    private static void additionOperation(Scanner scanner) {
        System.out.println("Enter the 1st number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Sum: " + sum);
    }

    private static void subtractionOperation(Scanner scanner) {
        System.out.println("Enter the 1st number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int secondNumber = scanner.nextInt();

        int difference = firstNumber - secondNumber;

        System.out.println("Difference: " + difference);
    }

    private static void multiplicationOperation(Scanner scanner) {
        System.out.println("Enter the 1st number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int secondNumber = scanner.nextInt();

        int product = firstNumber * secondNumber;

        System.out.println("Product: " + product);
    }

    private static void divisionOperation(Scanner scanner) {
        System.out.println("Enter the 1st number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int secondNumber = scanner.nextInt();

        double quotient = (double) firstNumber / secondNumber;

        System.out.println("Quotient: " + quotient);
    }

    private static void exponentiationOperation(Scanner scanner) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a base number :");
        int base = scan.nextInt();
        System.out.print("Enter an exponent number :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }
    private static void factorialCalculation(Scanner scanner) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);

    }
    private static void  moduloOperation(Scanner scanner) {
        System.out.println("Enter the  number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the module number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Result: " + (firstNumber%secondNumber));
    }
    private static void  rectangleAreaAndPerimeterCalculation(Scanner scanner) {
        System.out.println("Enter the  one side of rectangle: ");
        int sideOne = scanner.nextInt();
        System.out.println("Enter the another side of rectangle: ");
        int sideTwo = scanner.nextInt();
        System.out.println("Area: " + (sideOne*sideTwo)+"\n Perimeter : "+(2*(sideOne+sideTwo)));
    }
}
