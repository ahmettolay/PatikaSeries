import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Yıl giriniz : ");
        year = input.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " artık yıldır!");
        }else {
            System.out.println(year + " artık değildir!");
        }
    }
}
