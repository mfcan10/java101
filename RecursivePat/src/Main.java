import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        int processValue = recursiveProcessMinus(number);
        recursiveProcessPlus(processValue,number);;
    }
    public static int recursiveProcessMinus(int processValue){
        if(processValue <=0) return processValue;
        System.out.print(processValue +" ");
        return recursiveProcessMinus(processValue-5);
    }
    public static void recursiveProcessPlus(int processValue, int userInput){
        if (userInput>=processValue) {
            System.out.print(processValue + " ");
            recursiveProcessPlus(processValue + 5, userInput);
        }
    }
}

