import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, k, sayiAdedi = 0, toplam = 0, ortalama;


            System.out.print("Lütfen Sayı Girini : ");
            k = input.nextInt();
            for (i=12 ; i <= k; i += 12) {
                if (i % 12 == 0) {
                    System.out.println(i);
                    toplam += i;
                    sayiAdedi++;

                } else {
                    System.out.println("lütfen Pozitif Tam Sayı Giriniz!");

                }

            }
            ortalama = toplam / sayiAdedi;
            System.out.println("ortalama : "+ortalama);
        }
      /*  boolean tamSayi = false;
        while (!tamSayi) {
            System.out.print("Lütfen Sayı Girini : ");
            k = input.nextInt();
            for (i=12 ; i <= k; i += 12) {
                if (i % 12 == 0) {
                    System.out.println(i);
                    toplam += i;
                    sayiAdedi++;
                    tamSayi = true;
                } else {
                    System.out.println("lütfen Pozitif Tam Sayı Giriniz!");

                }

            }
            ortalama = toplam / sayiAdedi;
            System.out.println("ortalama : "+ortalama);
        }*/

    }




