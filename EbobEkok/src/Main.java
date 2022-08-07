import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = scanner.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = scanner.nextInt();
        int ebob = 1;
        int i = 1;
        int j = 1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println(ebob);
        int ekok = 1;
        while (j <= n1 * n2) {
            if (j % n2 == 0 && j % n1 == 0) {
                ekok = j;
                break;
            }
            j++;
        }
        System.out.println(ekok);
    }


}
