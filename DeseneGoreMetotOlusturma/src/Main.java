import java.util.Scanner;

public class Main {

    static void f(int n) {

        if (n >0) {
            System.out.println(n);
            f(n-5);

        }  System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

      f(n);
    }
}

