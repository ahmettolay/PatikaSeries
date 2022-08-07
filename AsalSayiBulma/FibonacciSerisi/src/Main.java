import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı giriniz : ");
        int x = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;

        int total = 0;
        System.out.print(x+" Sayılı Fibonacci Serisi : ");
        for (int i = 1; i <= x; i++) {

            System.out.print(n1 + " ");
            total=n1+n2;
            n1=n2;
            n2=total;

        }
    }
}
