import java.util.Scanner;

public class Main {
    static int power(int n1, int n2) {
        int result = 1;
        for (int i = 1; i <= n2; i++) {
            result *= n1;
        }
        System.out.println(n1 + "^" + n2 + " = " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1 Değerini Giriniz : ");
        int n1 = scanner.nextInt();
        System.out.print("n1 Değerini Giriniz : ");
        int n2 = scanner.nextInt();
        power(n1,n2);

    }
}
