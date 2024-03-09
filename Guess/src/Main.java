import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int gizliSayi = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int tahmin;
        do {
            System.out.print("Bir sayı tahmin edin (1-100): ");
            tahmin = scanner.nextInt();
        } while (tahmin < 1 || tahmin > 100);
        if (tahmin == gizliSayi) {
            System.out.println("Tebrikler! Sayıyı doğru tahmin ettiniz.");
        } else if (tahmin < gizliSayi) {
            System.out.println("Tahmininiz gizli sayıdan küçük. Tekrar deneyin.");
        } else {
            System.out.println("Tahmininiz gizli sayıdan büyük. Tekrar deneyin.");
        }
        System.out.print("Tekrar oynamak ister misiniz? (e/h): ");
        String cevap = scanner.next();
        if (cevap.equalsIgnoreCase("e")) {
            main(args);
        }
    }
}
