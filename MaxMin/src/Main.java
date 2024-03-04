import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many number will you enter  : ");
        int count = input.nextInt();
        System.out.print("Please enter 1.number :  ");
        int first = input.nextInt();
        int max=first,min=first;
        for (int i=2;i<=count;i++){
            System.out.print("Please enter "+i+".number :  ");
            int temp=input.nextInt();
            if(temp>=max){
                max=temp;
            }
            if(temp<=min){
                min=temp;
            }
        }
        System.out.println("Max is : "+max);
        System.out.println("Min is : "+min);
    }
}