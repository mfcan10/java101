import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int km;
        final double PER_KM=2.20;
        double amount;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a distance as kilometer : ");
        km = input.nextInt();
        amount=10+(PER_KM*km);
        if(amount<20)
            System.out.println("Total amount is : 20 TL");
        else
            System.out.println("Total amount is : "+amount+" TL");

    }
}