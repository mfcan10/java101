import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number : ");
        int n = input.nextInt();
        int divisors=0;
        for(int i=1;i<n; i++){
            if(n%i==0){
                divisors+=i;
            }
        }
        if(n==divisors){
            System.out.println(n+" is a perfect number");
        }
        else{
            System.out.println(n+" is not a perfect number");
        }
    }
}