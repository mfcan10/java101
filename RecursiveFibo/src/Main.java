import java.util.Scanner;
public class Main{
    static int recursiveF(int x){
        if(x<2){
            return x;
        }
        else{
            return recursiveF(x-1)+recursiveF(x-2);
        }
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter an integer number :");
        int n = input.nextInt();
        System.out.println(recursiveF(n));
    }
}