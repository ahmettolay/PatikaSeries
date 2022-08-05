import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basama Değerlerinin Toplanmasını İstediğiniz Sayıyı Giriniz : ");
        int sayi = scanner.nextInt();
        int degiskenSayi = sayi;
        int basamakDegeri;
        int toplam = 0;
        while (degiskenSayi != 0) {
            basamakDegeri = degiskenSayi % 10;
            toplam += basamakDegeri;
            degiskenSayi/=10;
        }
        System.out.println(toplam);
    }
}
