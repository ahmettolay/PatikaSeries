import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  Scanner scanner = new Scanner(System.in);
     /*   String userName, password;
        int right = 3;
        int select;
        int price;
        int totalPrice = 1500;

       while (right > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            userName = scanner.nextLine();
            System.out.print("Şirfenizi Giriniz : ");
            password = scanner.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba Kodluyoruz Bankasına Hoş Geldiniz.");
                do {
                    System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" +"3-Bakiye Sorgulama\n" + "4-Çıkış");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    select = scanner.nextInt();
                    if (select == 1) {
                        System.out.print("Yatarıracağınız Miktarı Girini : ");
                        price = scanner.nextInt();
                        totalPrice += price;
                        System.out.println("Yeni Bakiyeniz " + totalPrice);
                    } else if (select == 2) {
                        System.out.print("Çekeceğiniz Miktarı Girniz : ");
                        price = scanner.nextInt();
                        if (price > totalPrice) {
                            System.out.println("Yetersiz Bakiye !");

                        } else {
                            totalPrice -= price;
                            System.out.println("Yeni Bakiyeniz : " + totalPrice);
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + totalPrice);
                    }
                } while (select != 4); {
                    System.out.println("Tekrar Görüşmek Üzere !");
                    break;
                }

            }
            else{
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre Girişi Yaptınız ");

                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur Lütfen Banka ile iletişime Geçiniz!");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
        }
        }*/

        Scanner scanner = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int select;
        int price;
        int totalPrice = 1500;

        while (right > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            userName = scanner.nextLine();
            System.out.print("Şirfenizi Giriniz : ");
            password = scanner.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba Kodluyoruz Bankasına Hoş Geldiniz.");

                do {
                    System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatarıracağınız Miktarı Girini : ");
                            price = scanner.nextInt();
                            totalPrice += price;
                            System.out.println("Yeni Bakiyeniz " + totalPrice);
                            break;
                        case 2:
                            System.out.print("Çekeceğiniz Miktarı Girniz : ");
                            price = scanner.nextInt();
                            if (price > totalPrice) {
                                System.out.println("Yetersiz Bakiye !");

                            } else {
                                totalPrice -= price;
                                System.out.println("Yeni Bakiyeniz : " + totalPrice);
                                break;

                            }
                        case 3: {
                            System.out.println("Bakiyeniz : " + totalPrice);
                            break;
                        }
                        case 4: {
                            System.out.println("Tekrar Görüşmek Üzere !");
                            break;
                        }
                    }


                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre Girişi Yaptınız ");

                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur Lütfen Banka ile iletişime Geçiniz!");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }


    }
}



