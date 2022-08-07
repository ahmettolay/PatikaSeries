import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n= scanner.nextInt();
        int total=0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                total+=i;
            }

        }
        if (total == n) {
            System.out.println(n +" Sayısı Mükkemmel Sayıdır.");
        }else {
            System.out.println(n+" Sayısı Mükemmel Sayı Değildir.");
        }
    }
}
