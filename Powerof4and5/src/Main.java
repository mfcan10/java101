import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Please enter a number :");
        n=input.nextInt();
        for (int i = 1; i <= n; i++) {
            int powerOfFour = (int) Math.pow(4, i);
            int powerOfFive = (int) Math.pow(5, i);
            if (powerOfFour <= n && powerOfFive <= n) {
                System.out.println("4^" + i + " = " + powerOfFour + "    5^" + i + " = " + powerOfFive);
            }
        }
    }
}