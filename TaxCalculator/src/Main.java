import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int price;
        double wtax;
        final double ltax = 0.18;
        final double btax = 0.08;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a price : ");
        price=input.nextInt();
        if (price<=1000) {
            wtax = price + (price * ltax);
            System.out.println(" Price without tax : "+price+"\n Price with tax : "+wtax+"\n Tax rate : "+ltax);
        }
        else {
            wtax = price + (price * btax);
            System.out.println(" Price without tax : "+price+"\n Price with tax : "+wtax+"\n Tax rate : "+btax);
        }
    }
}