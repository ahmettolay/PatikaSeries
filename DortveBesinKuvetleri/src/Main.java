import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i,n,j;
        Scanner input=new Scanner(System.in);
        System.out.println("Sınır Sayısını Girniz : ");
        n= input.nextInt();
        System.out.println("4 ün kuvvetleri");
        for (i=1;i<=n;i*=4 ) {
            System.out.println(i);
        }
        System.out.println("5 ün kuvvetleri");
        for (j=1;j<=n;j*=5 ) {
            System.out.println(j);
        }
    }
}
