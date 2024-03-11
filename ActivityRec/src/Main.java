import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int temperature;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter  temperature: ");
        temperature = input.nextInt();
        if (temperature > 25) {
            System.out.println("What about swimming ?");
        } else if (temperature >= 15) {
            System.out.println("Lets go to the hiking");
        } else if (temperature >= 5) {
            System.out.println("Shall we watch film ?");
        } else {
            System.out.println("Snowboard Time!.!.!.!");
        }
    }
}
