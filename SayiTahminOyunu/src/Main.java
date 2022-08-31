import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);

        Scanner scanner = new Scanner(System.in);

        int rigth = 0;
        int selected;
        int wrong[] = new int[5];
        boolean isWin=false;

        while (rigth < 5) {
            System.out.print("Lütfen Tahminde Bulunduğunuz Sayıyı Giriniz : ");
            selected = scanner.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasonda bir değer giriniz.");
                continue;

            }

            if (selected == number) {
                System.out.println("Tebrikler Doğru Tahmin ! Tanmin ettiginiz Sayı : " + number);

                break;
            } else {
                wrong[rigth] = selected;
                rigth++;
                System.out.println("Hatalı bir sayı dirdiniz.");
                if (selected > number) {
                    System.out.println(selected + " Sayısı gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " Sayısı gizli sayıdan küçüktür.");
                }
                System.out.println("Kalan hakkınız : " + (5 - rigth));

            }

        }
        if (!isWin) {
            System.out.println("Hakkınız Bitti Kaybettiniz!");
            System.out.println("Tahminleriniz"+ Arrays.toString(wrong));
            System.out.println("Bulmanınz gereken sayı : "+number );

        }
    }
}
