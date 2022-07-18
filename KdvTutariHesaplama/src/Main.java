import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double price, kdv, pricekdv;
        boolean kdvDurumu;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ürün Fiyatı : ");
        price = inp.nextDouble();


        kdvDurumu = (0 < price) && (price < 1000);
        kdv = kdvDurumu ? 0.18d : 0.08d;


        pricekdv = (price * kdv) + price;


        System.out.println("Ürünün KDV'siz fiyatı : " + price);
        System.out.println("Ürünün KDV oranı : " + kdv);
        System.out.println("Ürünün KDV dahil fiyatı : " + pricekdv);


    }
}
