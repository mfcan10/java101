import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int a ,b;
        double c,u,area;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a first side of triangle : ");
        a=input.nextInt();
        System.out.println("Please enter a second side of triangle : ");
        b=input.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        u=(a+b+c)/2;
        area=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Hypotenuse of triangle is : "+c);
        System.out.println("Area of triangle is : "+area);
    }
}