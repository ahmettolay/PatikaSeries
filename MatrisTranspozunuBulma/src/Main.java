import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tranzpozunu bılmak istediğiniz dizinin satırını girin: ");
        int row = input.nextInt();
        System.out.print("Tranzpozunu bılmak istediğiniz dizinin sütününu girin: ");
        int col = input.nextInt();

        int[][] list = new int[row][col];
        int[][] list2 = new int[col][row];
        for(int i =0 ;i < row; i++){
            for(int j = 0 ; j< col; j++){
                System.out.print(i + ". satırın " + j + ". elemanını giriniz: ");
                list[i][j]= input.nextInt();
            }
        }
        for(int i = 0 ; i< row; i++){
            for(int j = 0; j<col; j++){
                list2[j][i] = list[i][j];
            }
        }
        for (int i = 0; i <list2.length ; i++){
            for(int j = 0 ; j<list2[i].length;j++){
                System.out.print(list2[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
