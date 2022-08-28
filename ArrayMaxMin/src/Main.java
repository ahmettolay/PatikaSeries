import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int list[] = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        Scanner scanner=new Scanner(System.in);
        System.out.printf("N değerini Giriniz : ");
        int n= scanner.nextInt();


        int min = list[0];
        int max = list[0];
        for (int i: list) {
            if (i<n) {
                min=i;
            }
            if (i>n){
                max=i;
                break;
            }
        }System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

    }
}
