package Other;

import java.util.Scanner;
import java.lang.String;


public class Greetings {

    public static void main (String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.print("Hi User, to access the system you must enter your username and password \n Username: " );
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        if (password.equals("password")){
            System.out.println("Access granted");
        }else{
            System.out.println("Access Denied");
        }
    }
}
