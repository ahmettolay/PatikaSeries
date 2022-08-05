import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısını Girini : ");
        int n = scanner.nextInt();
        double total = 0;

        for (double i = 1; i <= n; i++) {
            total += (1 / i);
        }
        System.out.println(total);


    }
}
