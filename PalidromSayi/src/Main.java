public class Main {

    static boolean isPalindrom(int number) {
        int temp = number, lastNumber, reverseNumber = 0;

        while (temp != 0) {
            // System.out.println("-----------------------");
            // System.out.println("sayı   =   " + temp);


            lastNumber = temp % 10;
            // System.out.println("son basamak = " + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
            //  System.out.println("yeni sayı = " + reverseNumber);
            temp /= 10;
            //  System.out.println( "yeni temp  = "+temp);

        }
        if (reverseNumber == number) {
            return true;
        } else {
            return false;
        }


    }


    public static void main(String[] args) {

        System.out.println(isPalindrom(25));

    }
}
