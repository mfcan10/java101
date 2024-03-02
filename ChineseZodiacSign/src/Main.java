import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        year = input.nextInt();
        int zodiacIndex = year % 12;
        if (zodiacIndex == 0) {
            System.out.println("Your Chinese zodiac animal is: Monkey");
        } else if (zodiacIndex == 1) {
            System.out.println("Your Chinese zodiac animal is: Rooster");
        } else if (zodiacIndex == 2) {
            System.out.println("Your Chinese zodiac animal is: Dog");
        } else if (zodiacIndex == 3) {
            System.out.println("Your Chinese zodiac animal is: Pig");
        } else if (zodiacIndex == 4) {
            System.out.println("Your Chinese zodiac animal is: Rat");
        } else if (zodiacIndex == 5) {
            System.out.println("Your Chinese zodiac animal is: Ox");
        } else if (zodiacIndex == 6) {
            System.out.println("Your Chinese zodiac animal is: Tiger");
        } else if (zodiacIndex == 7) {
            System.out.println("Your Chinese zodiac animal is: Rabbit");
        } else if (zodiacIndex == 8) {
            System.out.println("Your Chinese zodiac animal is: Dragon");
        } else if (zodiacIndex == 9) {
            System.out.println("Your Chinese zodiac animal is: Snake");
        } else if (zodiacIndex == 10) {
            System.out.println("Your Chinese zodiac animal is: Horse");
        } else if (zodiacIndex == 11) {
            System.out.println("Your Chinese zodiac animal is: Goat");
        } else {
            System.out.println("Invalid input. Please enter a valid year.");
        }
    }
}