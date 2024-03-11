import java.util.Arrays;
import java.util.Scanner;
public class Main{
    static int[] arr;
   static Scanner input = new Scanner(System.in);
    static int[] takeInput(int n){
        int temp=0;
        int cnt=0;
        arr=new int[n];
        for(int i=1;i<=n;i++){
            System.out.println("Please enter "+i+".number :");
            temp=input.nextInt();
            arr[(i-1)]=temp;
        }
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {

        System.out.println("Please enter length of array : ");
        int n = input.nextInt();
        int[] x=takeInput(n);
        System.out.println("Sorted array is :");
        for(int i:x){
            System.out.print(i+",");
        }
    }
}