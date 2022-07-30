import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*  Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı
        ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
        İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri
        uygulayın ;
         - Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2)
        olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         - Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
         - Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
         - Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
         - Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
     */

        int yas, yolculukTipi, mesafe;
        double normalTutar, inidirmliTutar, yasIndirimi, toplamTutar;
        double cocukIndirimi, gencInidirmi, yasliInidirmi, yetiskinIndirimi, ciftYonIndirimi, kmBasınaUcret;
        cocukIndirimi = 0.5;
        gencInidirmi = 0.1;
        yasliInidirmi = 0.3;
        yetiskinIndirimi = 0;
        ciftYonIndirimi = 0.2;
        kmBasınaUcret = 0.1;
        Scanner input = new Scanner(System.in);
        System.out.print("Yolculuk Tipini Giriniz Tek Yön =1 , Gidiş-Dönüş = 2  ");
        yolculukTipi = input.nextInt();

        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();

        System.out.print("Mesae km cinsinden giriniz : ");
        mesafe = input.nextInt();

        normalTutar = mesafe * 0.1;
        switch (yolculukTipi) {
            case 1:
                if (yas >= 0 && yas < 12 && mesafe > 0) {
                    normalTutar = mesafe * kmBasınaUcret;
                    yasIndirimi = normalTutar * cocukIndirimi;
                    toplamTutar = normalTutar - yasIndirimi;
                    System.out.println("Ödenecek Tutar : " + toplamTutar);
                } else if (yas >= 12 && yas <= 24 && mesafe > 0) {
                    normalTutar = mesafe * kmBasınaUcret;
                    yasIndirimi = normalTutar * gencInidirmi;
                    toplamTutar = normalTutar - yasIndirimi;
                    System.out.println("Ödenecek Tutar : " + toplamTutar);
                } else if (yas > 24 && yas < 65 && mesafe > 0) {
                    normalTutar = mesafe * kmBasınaUcret;
                    yasIndirimi = normalTutar * yetiskinIndirimi;
                    toplamTutar = normalTutar - yasIndirimi;
                    System.out.println("Ödenecek Tutar : " + toplamTutar);

                } else if (yas >= 65 && mesafe > 0) {
                    normalTutar = mesafe * kmBasınaUcret;
                    yasIndirimi = normalTutar * yasliInidirmi;
                    toplamTutar = normalTutar - yasIndirimi;
                    System.out.println("Ödenecek Tutar : " + toplamTutar);
                } else if (yas < 0||mesafe < 0) {
                    System.out.println("Yaş Değeri veya Mesafe Negatif Olamaz Giremezsiniz");
                }
                break;


            case 2:
                if (yas < 12 && yas >= 0 && mesafe > 0) {
                    normalTutar = mesafe * kmBasınaUcret;
                    yasIndirimi = normalTutar * cocukIndirimi;
                    toplamTutar = normalTutar - yasIndirimi;
                    toplamTutar = (toplamTutar - (toplamTutar * ciftYonIndirimi)) * 2;
                    System.out.println("Ödenecek Tutar : " + toplamTutar);
                } else if (yas >= 12 && yas <= 24 && mesafe > 0) {
                    normalTutar = mesafe * kmBasınaUcret;
                    yasIndirimi = normalTutar * gencInidirmi;
                    toplamTutar = normalTutar - yasIndirimi;
                    toplamTutar = (toplamTutar - (toplamTutar * ciftYonIndirimi)) * 2;
                    System.out.println("Ödenecek Tutar : " + toplamTutar);
                } else if (yas > 24 && yas <= 65 && mesafe > 0) {
                    normalTutar = mesafe * kmBasınaUcret;
                    yasIndirimi = normalTutar * yetiskinIndirimi;
                    toplamTutar = normalTutar - yasIndirimi;
                    toplamTutar = (toplamTutar - (toplamTutar * ciftYonIndirimi)) * 2;
                } else if (yas >= 65 && mesafe > 0) {
                    normalTutar = mesafe * kmBasınaUcret;
                    yasIndirimi = normalTutar * yasliInidirmi;
                    toplamTutar = normalTutar - yasIndirimi;
                    toplamTutar = (toplamTutar - (toplamTutar * ciftYonIndirimi)) * 2;
                    System.out.println("Ödenecek Tutar : " + toplamTutar);
                } else if (yas < 0 || mesafe < 0) {
                    System.out.println("Yaş Değeri veya Mesafe Negatif Olamaz Giremezsiniz");
                }
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız Tek Yön veya Gidiş-Dönüş Değerleini Seçiniz");
                break;
        }
    }

}

