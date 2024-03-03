import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,i,total=0,amount=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number : ");
        n= input.nextInt();
        for (i=1; i<=n ;i++){
            if(i%3==0 && i%4==0){
                amount++;
                total+=i;
            }
        }
        int result;
        if (amount != 0) {
            result = total / amount;
            System.out.println(result);
        } else {
            System.out.println("No numbers divisible by both 3 and 4 found in the range.");
        }
    }
}