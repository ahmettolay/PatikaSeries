import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day = input.nextInt();
        if ((day >= 21 && day <= 31 && month == 3) || (day >= 1 && day <= 20) && month == 4) {
            System.out.println("Koc Burcusunuz");
        } else if ((day >= 21 && day <= 30 && month == 4) || (day >= 1 && day <= 21) && month == 5) {
            System.out.println("Boga Burcusunuz");
        } else if ((day >= 22 && day <= 31 && month == 5) || (day >= 1 && day <= 22) && month == 6) {
            System.out.println("Ikizler Burcusunuz");
        } else if ((day >= 23 && day <= 30 && month == 6) || (day >= 1 && day <= 22) && month == 7) {
            System.out.println("Yengec Burcusunuz");
        } else if ((day >= 23 && day <= 31 && month == 7) || (day >= 1 && day <= 22) && month == 8) {
            System.out.println("Aslan Burcusunuz");
        } else if ((day >= 23 && day <= 31 && month == 8) || (day >= 1 && day <= 22) && month == 9) {
            System.out.println("Basak Burcusunuz");
        } else if ((day >= 23 && day <= 30 && month == 9) || (day >= 1 && day <= 22) && month == 10) {
            System.out.println("Terazi Burcusunuz");
        } else if ((day >= 23 && day <= 31 && month == 10) || (day >= 1 && day <= 22) && month == 11) {
            System.out.println("Akrep Burcusunuz");
        } else if ((day >= 22 && day <= 30 && month == 11) || (day >= 1 && day <= 21) && month == 12) {
            System.out.println("Yay Burcusunuz");
        } else if ((day >= 22 && day <= 31 && month == 12) || (day >= 1 && day <= 21) && month == 1) {
            System.out.println("Oglak Burcusunuz");
        } else if ((day >= 22 && day <= 31 && month == 1) || (day >= 1 && day <= 19) && month == 2) {
            System.out.println("Kova Burcusunuz");
        } else if ((day >= 20 && day <= 28 && month == 2) || (day >= 1 && day <= 20) && month == 3) {
            System.out.println("Balik Burcusunuz");
        }

    }
    }

