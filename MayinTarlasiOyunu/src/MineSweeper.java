import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MineSweeper {
    int rowNumber, colNumber, size, hp;

    String map[][];
    String bord[][];
    boolean game = true;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);


    MineSweeper(int row, int col) {
        this.rowNumber = row;
        this.colNumber = col;
        this.map = new String[row][col];
        this.bord = new String[row][col];
        this.size = row * col;
        this.hp = size - (size / 4);

    }


    public void run() {

        prepareGame();

        print(map);
        System.out.println("Oyun Başladı");
        print(bord);
        while (game) {
            int row, col;
            System.out.print("Satır İndis Numarasını Giriniz : ");
            row = scanner.nextInt();
            System.out.print("Sütun İndis Numarasını Giriniz : ");
            col = scanner.nextInt();

            if (row >= 0 && col >= 0 && row < map.length && col < map[0].length) {

                if (!map[row][col].equals("*")) {
                    checkMine(row, col);
                    print(bord);
                    hp--;
                } else {
                    game = false;
                    System.out.println("Game Over ! ");
                }
            } else {
                System.out.println("Lütfen harita aralığında (0-" + (map.length - 1) + ")değer giriniz ");

            }if (hp==0){
                System.out.println("Tebrikler Kazandınız ");
                break;
            }

        }
    }

    public void checkMine(int r, int c) {
        int envBomb = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if ((r + i > 0) && (r + i) < map.length && (c + j > 0) && (c + j < map[0].length) && map[r + i][c + j] != "*") {
                    bord[r][c] = "0";
                }
            }
        }
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if ((r + i >= 0) && (r + i) < map.length && (c + j >= 0) && (c + j < map[0].length) && map[r + i][c + j] == "*") {
                    envBomb++;
                    String newEnvBomb = String.valueOf(envBomb);
                    bord[r][c] = newEnvBomb;
                }

            }
        }


    }


    public void prepareGame() {
        int randomRow, randomCol;
        int count = 0;

        while (count != size / 4) {
            randomRow = random.nextInt(rowNumber);
            randomCol = random.nextInt(colNumber);
            if (map[randomRow][randomCol] != ("*")) {
                map[randomRow][randomCol] = ("*");
                count++;
            }

        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] != "*") {
                    map[i][j] = "-";
                }
            }
        }
        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord[0].length; j++) {
                bord[i][j] = "-";
            }
        }

    }


    public void print(String[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

