import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a col number :");
        int col= input.nextInt();
        System.out.println("Please enter a row number :");
        int row= input.nextInt();
        MineSweeper x= new MineSweeper(col,row);
        x.run();
    }
}