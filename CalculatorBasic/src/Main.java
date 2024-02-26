import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int n1,n2,process;
        int result=0;
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a first integer number : ");
        n1 = input.nextInt();
        System.out.println("Please enter a second integer number : ");
        n2 = input.nextInt();
        System.out.println("Select a process \n1-Plus\n2-Minus\n3-Multiply\n4-Divide");
        process=input.nextInt();
        switch(process)
        {
            case 1:
                result=(n1+n2);
                break;
            case 2:
                result=(n1-n2);
                break;
            case 3:
                result=(n1*n2);
                break;
            case 4:
                result=(n1/n2);
                break;
            default:
                System.out.println("No valid process");

        }
        System.out.println("Result is " + result);
    }
}