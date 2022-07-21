import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, a;
        double alan, cevre;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçap değerini giriniz : ");
        r = inp.nextInt();
        System.out.print("Merkez açısı ölçüsünü giriniz : ");
        a = inp.nextInt();


        alan = (pi * (r * r) * a) / 360;
        cevre = 2 * pi * r * a / 360;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çervesi : " + cevre);
    }


}

