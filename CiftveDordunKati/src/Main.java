import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i;
        int total = 0;
        do {
            System.out.print("Sayı Griniz : ");
            i = input.nextInt();
            if (i % 2 == 0 && i % 4 == 0) {
                total += i;
            }
        } while (i > 0 && i % 2 == 0);
        System.out.println("Toplam : " + total);
    }
}
