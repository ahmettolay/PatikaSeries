import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;
        int enKücük, orta, enBüyük;
        System.out.print("a = ");
        a = inp.nextInt();

        System.out.print("b = ");
        b = inp.nextInt();

        System.out.print("c = ");
        c = inp.nextInt();


        if (a > b && a > c) {
            enBüyük = a;
        } else if (b > c) {
            enBüyük = b;
        } else {
            enBüyük = c;
        }
        if (a < b && a < c) {
            enKücük = a;
        } else if (b < c) {
            enKücük = b;
        } else {
            enKücük = c;
        }
        if (a < b && a > c) {
            orta = a;
        } else if ((b < a && b > c) || (b < c && b > a)) {
            orta = b;
        } else {
            orta = c;
        }
        System.out.println(enKücük + "<" + orta + "<" + enBüyük);
    }
}
