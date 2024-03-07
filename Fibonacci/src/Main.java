import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a last element : ");
        int n = input.nextInt();
        int a = 0, b = 1, c;
        for (int i = 0; i < n; ++i) {
            if (i == 0 || i == 1) {
                c = i;
            } else {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.print(c + " ");
        }
    }
}