import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double boy, vucutKitleEndeksi;
        int kilo;

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz :");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextInt();
        vucutKitleEndeksi = kilo/(boy*boy) ;
        System.out.println("Vucut kitle endeksiniz : " +vucutKitleEndeksi);

    }
}
