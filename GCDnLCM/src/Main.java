import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :");
        int first = input.nextInt();
        System.out.println("Enter second number :");
        int second = input.nextInt();
        int max, min, gcd = 1;
        if (first <= second) {
            min = first;
            max = second;
        } else {
            min = second;
            max = first;
        }
        int cnt=1;
        while (cnt<=min) {
            if ((first % cnt == 0) && (second % cnt == 0)) {
                if (cnt >= gcd) {
                    gcd = cnt;
                }
            }
            cnt++;
        }
        int lcm=(first*second)/gcd;
        System.out.println("GCD : "+gcd+" LCM : "+lcm);
    }
}