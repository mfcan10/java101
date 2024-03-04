import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int number=input.nextInt();
        int temp=number,sum=0;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        System.out.println("Result is  : "+sum);
    }
}