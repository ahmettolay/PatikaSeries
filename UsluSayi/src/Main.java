import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n, k;
        System.out.print("Üssü Alıncak Sayı : ");
        n = scanner.nextInt();
        System.out.print("Üs Olacak Sayı : ");
        k = scanner.nextInt();
        int total = 1;
        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println(n + "^" + k + " = " + total);
    }
}
