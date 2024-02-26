import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int n1,n2,n3,max,min,mid;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first integer number : ");
        n1=input.nextInt();
        System.out.println("Please enter second integer number : ");
        n2=input.nextInt();
        System.out.println("Please enter third integer number : ");
        n3=input.nextInt();
        if(n1>n2) {
            if (n1 > n3) {
                max = n1;
                if (n2>n3) {
                    min = n3;
                    mid=n2;
                }
                else {
                    min = n2;
                    mid=n3;
                }
            } else {
                max = n3;
                min = n2;
                mid = n1;
            }
        }
        else{
            if (n2>n3){
                max=n2;
                if (n3>n1){
                    mid=n3;
                    min=n1;
                }
                else{
                    mid=n1;
                    min=n3;
                }

            }
            else{
                max=n3;
                min=n1;
                mid=n2;
            }
        }
        System.out.println("Order of 3 number as ascending is : "+min+" "+mid+" "+max);
        input.close();
    }
}