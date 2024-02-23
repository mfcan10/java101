import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        final double PEAR=2.14;
        final double APPLE=3.67;
        final double TOMA=1.11;
        final double BANAN=0.95;
        final double EGGP=5.00;
        double p,a,t,b,e,total;
        Scanner input = new Scanner(System.in);
        System.out.println("How much pear as kg do you going to buy :");
        p=input.nextDouble();
        System.out.println("How much apple as kg do you going to buy :");
        a=input.nextDouble();
        System.out.println("How much tomato as kg do you going to buy :");
        t=input.nextDouble();
        System.out.println("How much banana as kg do you going to buy :");
        b=input.nextDouble();
        System.out.println("How much eggplant as kg do you going to buy :");
        e=input.nextDouble();
        total =((p*PEAR)+(a*APPLE)+(t*TOMA)+(b*BANAN)+(e*EGGP));
        System.out.println("Total amount is : "+total+" TL");
    }
}