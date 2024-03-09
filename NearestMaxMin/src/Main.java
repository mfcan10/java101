import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int kucuk = Integer.MAX_VALUE, buyuk = Integer.MIN_VALUE;
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] < sayi && dizi[i] > kucuk) {
                kucuk = dizi[i];
            } else if (dizi[i] > sayi && dizi[i] < buyuk) {
                buyuk = dizi[i];
            } else if (dizi[i] < sayi && kucuk == Integer.MAX_VALUE) {
                kucuk = dizi[i];
            } else if (dizi[i] > sayi && buyuk == Integer.MIN_VALUE) {
                buyuk = dizi[i];
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın değer: " + kucuk);
        System.out.println("Girilen sayıdan büyük en yakın değer: " + buyuk);
    }
}
