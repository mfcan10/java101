import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth day: ");
        day = input.nextInt();
        System.out.print("Enter your birth month: ");
        month = input.nextInt();

        if (month == 1) {
            if (day <= 19) {
                System.out.println("Your zodiac sign is Capricorn");
            } else if (day <= 31) {
                System.out.println("Your zodiac sign is Aquarius");
            }
        } else if (month == 2) {
            if (day <= 18) {
                System.out.println("Your zodiac sign is Aquarius");
            } else if (day <= 29) {
                System.out.println("Your zodiac sign is Pisces");
            }
        } else if (month == 3) {
            if (day <= 20) {
                System.out.println("Your zodiac sign is Pisces");
            } else if (day <= 31) {
                System.out.println("Your zodiac sign is Aries");
            }
        } else if (month == 4) {
            if (day <= 19) {
                System.out.println("Your zodiac sign is Aries");
            } else if (day <= 30) {
                System.out.println("Your zodiac sign is Taurus");
            }
        } else if (month == 5) {
            if (day <= 20) {
                System.out.println("Your zodiac sign is Taurus");
            } else if (day <= 31) {
                System.out.println("Your zodiac sign is Gemini");
            }
        } else if (month == 6) {
            if (day <= 20) {
                System.out.println("Your zodiac sign is Gemini");
            } else if (day <= 30) {
                System.out.println("Your zodiac sign is Cancer");
            }
        } else if (month == 7) {
            if (day <= 22) {
                System.out.println("Your zodiac sign is Cancer");
            } else if (day <= 31) {
                System.out.println("Your zodiac sign is Leo");
            }
        } else if (month == 8) {
            if (day <= 22) {
                System.out.println("Your zodiac sign is Leo");
            } else if (day <= 31) {
                System.out.println("Your zodiac sign is Virgo");
            }
        } else if (month == 9) {
            if (day <= 22) {
                System.out.println("Your zodiac sign is Virgo");
            } else if (day <= 30) {
                System.out.println("Your zodiac sign is Libra");
            }
        } else if (month == 10) {
            if (day <= 22) {
                System.out.println("Your zodiac sign is Libra");
            } else if (day <= 31) {
                System.out.println("Your zodiac sign is Scorpio");
            }
        } else if (month == 11) {
            if (day <= 21) {
                System.out.println("Your zodiac sign is Scorpio");
            } else if (day <= 30) {
                System.out.println("Your zodiac sign is Sagittarius");
            }
        } else if (month == 12) {
            if (day <= 21) {
                System.out.println("Your zodiac sign is Sagittarius");
            } else if (day <= 31) {
                System.out.println("Your zodiac sign is Capricorn");
            }
        } else {
            System.out.println("Invalid month entered. Please enter a month between 1 and 12.");
        }
    }
}