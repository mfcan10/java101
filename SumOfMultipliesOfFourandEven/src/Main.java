import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int temp,result=0;
       boolean checknumber=false;
       while(!checknumber){
           System.out.println("Please enter an integer number : ");
           temp= input.nextInt();
           if(temp%2==1){
               break;
           }
           else{
               if(temp%4==0){
                   result+=temp;
               }
           }
       }
    if (result != 0) {
        System.out.println(result);
    }
    else{
        System.out.println("No numbers divisible by 4 found in the inputs.");
    }
    }
}