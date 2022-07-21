import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlıcan, toplam;

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlıcanFiyat = 5;


        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo : ");
        armut = inp.nextDouble();

        System.out.print("Elma kaç kilo : ");
        elma = inp.nextDouble();

        System.out.print("Domates kaç kilo : ");
        domates = inp.nextDouble();

        System.out.print("Muz kaç kilo : ");
        muz = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo : ");
        patlıcan = inp.nextDouble();


        toplam = (armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) + (muz * muzFiyat) + (patlıcan * patlıcanFiyat);
        System.out.println("Toplam Tutar : " + toplam +" TL");

    }
}
