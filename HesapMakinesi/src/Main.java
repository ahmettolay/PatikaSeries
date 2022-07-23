import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n1, n2, select;

        System.out.print("İlk sayıyı giriniz : ");
        n1 = inp.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        n2 = inp.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapacağınız İşlemi Seçiniz : ");
        select = inp.nextInt();


        /*if(select==1){
            System.out.println("Toplam : "+ (n1+n2));
        } else if (select==2) {
            System.out.println("Fark : "+(n1-n2));

        } else if (select==3) {
            System.out.println("Çarpım : "+(n1*n2));
            
        } else if (select==4) {
            if (n2 == 0) {
                System.out.println("Bölen 0 olamaz");

            }else {
                System.out.println("Bölüm : "+ (n1/n2));
            }
        }*/
        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım : " + (n1 * n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                    System.out.println("Bölen 0 olamaz");
                    break;
                }
                System.out.println("Bölüm : "+ (n1/n2));
                break;

        }


    }
}
