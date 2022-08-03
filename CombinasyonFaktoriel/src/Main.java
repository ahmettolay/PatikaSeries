import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriel Değerini Giriniz : ");
        int n = scanner.nextInt();
        System.out.print("Combinasyon Değerini Giriniz : ");
        int r = scanner.nextInt();
        int total = 1;
        int totalr = 1;
        int totalk = 1;

        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        for (int i = 1; i <= r; i++) {
            totalr *= i;
        }
        int k=n-r;
        for (int i = 1; i <= k; i++) {
            totalk *= i;
        }
        System.out.println(total/(totalr*totalk));
    }
}

