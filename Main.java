import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keybordwrite = new Scanner(System.in);
       /*     double a, b, c;

        System.out.print("a kenarının değerini giriniz : ");
        a = keybordwrite.nextDouble();
        System.out.print("b kenarının değerini giriniz : ");
        b = keybordwrite.nextDouble();

        c= Math.sqrt((a*a)+(b*b)) ;
        System.out.println("Hipotenüs = "+ c);     */


        double a, b, c, alan, u;
        System.out.print("a kenarının değerini giriniz : ");
        a = keybordwrite.nextDouble();
        System.out.print("b kenarının değerini giriniz : ");
        b = keybordwrite.nextDouble();
        System.out.print("c kenarının değerini giriniz : ");
        c = keybordwrite.nextDouble();
        u = (a + b + c) / 2;

        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı = " + alan);


    }
}
