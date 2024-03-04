import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = input.nextInt();
        System.out.print("Enter second number : ");
        int sec = input.nextInt();
        System.out.print("Enter third number : ");
        int third = input.nextInt();
        System.out.print("Enter fourth number : ");
        int fourth = input.nextInt();
        int max;
        if(first>=sec){
            max=first;
        }
        else{
            max=sec;
        }
        if(third>=max){
            max=third;
        }
        if(fourth>=max){
            max=fourth;
        }
        System.out.println("The greatest number is  : "+max);
        System.out.println("********************************************");
        double rad,height;
        System.out.print("Enter radius number : ");
        rad= input.nextDouble();
        System.out.print("Enter height number : ");
        height = input.nextDouble();
        double vol,p=Math.PI;
        vol=((p*(rad*rad)*height)/3);
        System.out.println("Volume =  "+vol);
        System.out.print("Enter divisor number : ");
        int divisor = input.nextInt();
        System.out.println("3-digit positive numbers divisibe by "+divisor+" :");
        for(int i=100;i<=999;i++){
            if (i%divisor==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        double result=0,temp=0;
        for(double j =3;j>0;j*=3){
            temp=(1/j);
            if(temp>0.0001){
                result+=temp;
            }
            else{
                break;
            }
        }
        System.out.println("Sum of series : "+result);
        System.out.println("Enter first operand :  ");
        int foper = input.nextInt();
        input.nextLine();
        System.out.println("Enter operator(+ - * /) :  ");
        String ope = input.nextLine();
        System.out.println("Enter second operand :  ");
        int soper = input.nextInt();
        int fin=0;
        switch (ope){
            case"/":
                fin=foper/soper;
                break;
            case"*":
                fin=foper*soper;
                break;
            case"+":
                fin=foper+soper;
                break;
            case"-":
                fin=foper-soper;
                break;
            default:
                System.out.println("Invalid operator  ");
        }
        System.out.println("Result : "+fin);
    }
}
