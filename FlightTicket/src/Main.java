import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int distance,age,type;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a distance of your flight : ");
        distance= input.nextInt();
        System.out.println("Please enter your age : ");
        age= input.nextInt();
        System.out.println("Please select your flight type ( 1:One-way 2:With return) : ");
        type= input.nextInt();
        price = (distance*0.10);
        if(age<12){
            price*=0.5;
        } else if (12<=age&& age<24) {
            price*=0.9;
        } else if (65<age) {
            price*=0.7;
        }
        switch(type){
            case 1:
                System.out.println("Total price is : "+price);
                break;
            case 2:
                price*=2;
                price*=0.8;
                System.out.println("Total price is : "+price);
                break;
            default:
                System.out.println("Invalid flight type entered. Please enter 1 or 2. ");
        }
    }
}