import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password, userName,  newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Your Username : ");
        userName = inp.nextLine();

        System.out.print("Enter Your Password : ");
        password = inp.nextLine();

        if (userName.equals("tolay") && password.equals("12345")) {
            System.out.println("The username and password is correct \nYou are logged in");

        } else if (!userName.equals("tolay") && password.equals("12345")) {
            System.out.println("The  password is correct \n The username is not correct\nYou are not logged in");
            System.out.print("Enter Your Username : ");
            userName = inp.nextLine();

            System.out.print("Enter Your Password : ");
            password = inp.nextLine();

        } else if (userName.equals("tolay") && !password.equals("12345")) {
            System.out.println("The  username is correct \n The password is not correct \nYou are not logged in");

            System.out.print("Enter Your New Password : ");
            newPassword = inp.nextLine();
            password =newPassword;

        } else if (!userName.equals("tolay") && !password.equals("12345")) {
            System.out.println("The  username and password is not correct \nYou are not logged in");
            System.out.print("Enter Your Username : ");
            userName = inp.nextLine();

            System.out.print("Enter Your Password : ");
            password = inp.nextLine();
        }
    }
}
