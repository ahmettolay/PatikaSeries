import java.util.Scanner;

public class Main {
    static int sum(int n1, int n2) {
        int result = n1 + n2;
        System.out.println("Toplam = " + result);
        return result;
    }

    static int minus(int n1, int n2) {
        int result = n1 - n2;
        System.out.println("Çıkarma = " + result);
        return result;
    }

    static int times(int n1, int n2) {
        int result = n1 * n2;
        System.out.println("Çarpma = " + result);
        return result;
    }

    static int divided(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("n2  0(sıfır) olmaz!!!");
            return 0;
        }
        int result = n1 / n2;
        System.out.println("Bölüm = " + result);
        return result;
    }

    static int power(int n1, int n2) {
        int result = 1;
        for (int i = 1; i <= n2; i++) {
            result *= n1;
        }
        System.out.println(n1 + "^" + n2 + " = " + result);
        return result;
    }

    static int mod(int n1, int n2) {
        int result = n1 % n2;
        System.out.println(n1 + " % " + n2 + " = " + result);
        return result;
    }

    static void rectengle(int n1, int n2) {
        int recArea = n1 * n2;
        System.out.println("Dikdörtgenin Alanı = " + recArea);
        int recLong = 2 * (n1 + n2);
        System.out.println("Dikdörgenin Çevresi = " + recLong);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış";

        System.out.println(menu);
        while (true) {

            System.out.print("Bir İşlem Seçiniz : ");
            select = scanner.nextInt();
            if (select == 0) {
                break;
            }
            int n1, n2;
            System.out.print("n1 Değerini Giriniz : ");
            n1 = scanner.nextInt();
            System.out.print("n2 Değerini Giriniz : ");
            n2 = scanner.nextInt();

            switch (select) {
                case 1:
                    sum(n1, n2);
                    break;
                case 2:
                    minus(n1, n2);
                    break;
                case 3:
                    times(n1, n2);
                    break;
                case 4:
                    divided(n1, n2);
                    break;
                case 5:
                    power(n1, n2);
                    break;
                case 6:
                    mod(n1, n2);
                    break;
                case 7:
                    rectengle(n1, n2);
                    break;
            }

        }
        System.out.println("Program Kapatılıyor...");


    }
}
