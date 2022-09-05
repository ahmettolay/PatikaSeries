import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        System.out.println("Mayın Tarlasına Hoş Gelidiniz.");
        System.out.println("Lütfen oynamak istediğiniz boyutları ginirinz. ");
        System.out.print("Satır Sayısı : ");
        row = scanner.nextInt();
        System.out.print("Sutun Sayısı : ");
        col = scanner.nextInt();
        MineSweeper mineSweeper = new MineSweeper(row,col);
        mineSweeper.run();
    }
}
