import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int n=input.nextInt();
        double sum=1.0;
        for(int i=2;i<=n;i++){
            sum+=(1./i);
        }
        System.out.println("Result is : "+sum);
    }
}