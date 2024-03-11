import java.util.Scanner;
public class Main{
    static Scanner input = new Scanner(System.in);
    static void partO(){
        System.out.println("===============Part-1===================");
        System.out.println("Enter angle: (0-360)");
        int angle = input.nextInt();
        if((angle==0)||(angle==180)||(angle==360)){
            System.out.println("On horizontal axis");
        }else if((angle==90)||(angle==270)){
            System.out.println("On vertical axis");
        }else if ((0<angle)&&(angle<90)) {
            System.out.println("1st quadrand");
        }else if ((90<angle)&&(angle<180)) {
            System.out.println("2nd quadrand");
        }else if ((180<angle)&&(angle<270)) {
            System.out.println("3nd quadrand");
        }else if ((270<angle)&&(angle<360)) {
            System.out.println("4nd quadrand");
        }

    }
    static void partS(){
        System.out.println("===============Part-2===================");
        System.out.println("Enter first number :");
        int first = input.nextInt();
        System.out.println("Enter second number :");
        int second = input.nextInt();
        int max,min,gcd=1;
        if(first<=second){
            min=first;
            max=second;
        }
        else{
            min=second;
            max=first;
        }
        for(int i=1;i<=min;i++){
            if((first%i==0)&&(second%i==0)){
                if(i>=gcd){
                    gcd=i;
                }
            }
        }
        System.out.println("GCD :"+gcd);
    }
    static void partT() {
        boolean isPrime;
        System.out.println("===============Part-3===================");
        System.out.println("Enter a number :");
        int n = input.nextInt();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    static void partF(){
        System.out.println("===============Part-4===================");
        System.out.println("Enter a short string :");
        String st = input.next();
        System.out.println("Enter a short string :");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(st.repeat(i));
        }
    }
    public static void main(String[] args) {
        partO();
        partS();
        partT();
        partF();
    }
}