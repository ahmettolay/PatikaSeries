import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, turkce, tarih;

        Scanner imp = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz : ");
        mat = imp.nextInt();

        System.out.print("Türkçe notunu giriniz : ");
        turkce = imp.nextInt();

        System.out.print("Tarih notunu giriniz : ");
        tarih = imp.nextInt();

        int toplam = mat + tarih + turkce;
        double sonuc = toplam / 3;
        boolean kosul = sonuc > 60;

        String str = kosul ? "geçtiniz" : "kaldınız";
        System.out.println("Ortalamanız " + sonuc + " olduğu için " + str);

    }
}
