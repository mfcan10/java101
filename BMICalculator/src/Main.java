import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        double bmi,height;
        int weight;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your height as meter : ");
        height=input.nextDouble();
        System.out.println("Please enter your weight : ");
        weight=input.nextInt();
        bmi=(weight/(height*height));
        System.out.println("Your BMI is : "+bmi);
    }
}