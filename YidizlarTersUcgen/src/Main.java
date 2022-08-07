public class Main {
    public static void main(String[] args) {
        int n=10;
        for (int i=1;i<=n;i++){
            System.out.println();
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }for(int m=1;m<=2*n-(2*i+1);m++){
                System.out.print("*");
            }
        }
    }
}
