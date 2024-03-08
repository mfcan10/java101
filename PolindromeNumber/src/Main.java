import java.util.Scanner;
public class Main {
    static boolean reverse(int x){
        int temp=x,reverse=0,count=-1,temp2=x;
        while(temp2>0){
            temp2/=10;
            count++;
        }
        while(temp>0){
            int y = (int) Math.pow(10,count);
            reverse+=(temp%10)*(y);
            temp/=10;
            count--;
        }
        return x==reverse;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int x= input.nextInt();
        if(reverse(x)){
            System.out.println(x+" is polindrome");
        }
        else{
            System.out.println(x+" is not polindrome");
        }

    }
}