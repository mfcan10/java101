import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int r,a;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius of circle : ");
        r=input.nextInt();
        System.out.println("Please enter a angle of circle slice : ");
        a=input.nextInt();
        area = (((Math.PI)*(r*r)*a)/360);
        System.out.println("Area of circle slice is : "+area);
    }
}