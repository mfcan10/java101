import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = scanner.nextLine();
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (word.equals(reverse)) {
            System.out.println(word+" is polindrome word");
        } else {
            System.out.println(word+" is not polindrome word");
        }
    }
}