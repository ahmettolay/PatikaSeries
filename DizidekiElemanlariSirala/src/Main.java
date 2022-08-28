import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz : ");

        int n = scanner.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ". Elamanı : ");

            list[i] = scanner.nextInt();

        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
