import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birdYear;
        System.out.print("Doğum Yılınızı Giriniz : ");
        birdYear = input.nextInt();
        if (birdYear % 12 == 0 && birdYear > 0) {
            System.out.println("Çin Zodyağı Burcunuz Maymun");
        } else if (birdYear % 12 == 1 && birdYear > 0) {
            System.out.println("Çin Zodyağı Burcunuz Horoz");
        } else if (birdYear % 12 == 2 && birdYear > 0) {
            System.out.println("Çin Zodyağı Burcunuz Köpek");
        } else if (birdYear % 12 == 3 && birdYear > 0) {
            System.out.println("Çin Zodyağı Burcunuz Domuz");
        } else if (birdYear % 12 == 4 && birdYear > 0) {
            System.out.println("Çin Zodyağı Burcunuz Fare");
        } else if (birdYear % 12 == 5 && birdYear > 0) {
            System.out.println("Çin Zodyağı Burcunuz Öküz");
        } else if (birdYear % 12 == 6 && birdYear > 0) {
            System.out.println("Çin Zodyağı Burcunuz Kaplan");
        } else if (birdYear % 12 == 7 && birdYear > 0) {
            System.out.println("Çin Zodyağı Burcunuz Tavşan");
        } else if (birdYear % 12 == 8 && birdYear > 0) {
            System.out.println("Çin Zodyağı Burcunuz Ejderha");
        } else if (birdYear % 12 == 9 && birdYear > 0) {
            System.out.println("Çin Zodyağı Burcunuz Yılan");
        } else if (birdYear % 12 == 10 && birdYear > 0) {
            System.out.println("Çin Zodyağı Burcunuz At");
        } else if (birdYear % 12 == 11 && birdYear > 0) {
            System.out.println("Çin Zodyağı Burcunuz Koyun");
        } else {
            System.out.println("Doğum Tarihi Negatif Olamaz");
        }
    }
}
