import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int number = input.nextInt();
        System.out.println("Enter power : ");
        int pow = input.nextInt();
        int result=1;
        for(int i=1;i<=pow;i++){
            result*=number;
        }
        System.out.println("Result is : "+result);
    }
}