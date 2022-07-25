import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int heat;
        System.out.print("Sıcaklık Değerini Girini : ");
        heat = inp.nextInt();

       /* if(heat<5) {
            System.out.println("Kayak yapmaya gidebilirsin.");
        } else if (heat<25) {
            if (heat<15){
                System.out.println("Sinemaya gidebilirsin.");
               // System.out.println("Piknik yapmaya gidebilirsin.");
            }if (heat>10) {
                System.out.println("Piknik yapmaya gidebilirsin.");
            }
        }else {
            System.out.println("asdasda");
        }
*/

        if(heat<5){
            System.out.println("Kayak yapmaya gidebilirsin.");

        } else if (heat<10) {
            System.out.println("Sinemaya gidebilirsin.");
        } else if (heat>10 && heat<15) {
            System.out.println("Sinemaya gidebilirsin.");
            System.out.println("Piknik yapmaya gidebilirsin.");
        } else if (heat>15 && heat<25) {
            System.out.println("Piknik yapmaya gidebilirsin.");
        }else {
            System.out.println("Yüzmeye Gidebilirsin");
        }
    }
}
