import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int max = 1, min = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "." + "Sayıyı giriniz : ");
            int k = scanner.nextInt();
            if ( i == 1) {
                max = k;
                min = k;
            } else if (k > max) {
                max = k;
            } else if (k < min) {
                min = k;
            }
        }System.out.println(max);
        System.out.println(min);


    }
}
