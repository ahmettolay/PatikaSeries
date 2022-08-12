import java.util.Scanner;

public class Main {
    static void asal(int n1) {

        boolean isPrime = false;
        for (int i = 2; i < n1; i++) {
            if (n1 % i == 0) {
                isPrime = true;
            }
        }
        if (isPrime == false) {
            System.out.println(n1 + "Asal Sayıdır.");
        } else {
            System.out.println(n1 + "Asal Sayı Değildir.");
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        asal(n1);
    }


}
