package Mywork.Auth;

import java.sql.*;
import java.util.Calendar;
import java.util.Scanner;

public class Register {
    public static void main(String[] args)
    {
        Scanner dd = new Scanner(System.in);
        System.out.print("Hi, User please enter your First Name: ");
        String firstName = dd.nextLine();
        System.out.print("Please enter your Last Name: ");
        String lastName = dd.nextLine();
        System.out.print("Please enter your Username: ");
        String username = dd.nextLine();
        System.out.print("Please enter your password: ");
        String password = dd.nextLine();
        System.out.print("Please confirm your password: ");
        String confirmPassword = dd.nextLine();
        if (isValid(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
        try{
            // create a mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/Admin";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // create a sql date object so we can use it in our INSERT statement
            Calendar calendar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

            // the mysql insert statement
            String query = " insert into users (first_name, last_name, username, password, date_created, is_admin)"
                    + " values (?, ?, ?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, firstName);
            preparedStmt.setString (2, lastName);
            preparedStmt.setString (3, username);
            preparedStmt.setString (4, password);
            preparedStmt.setDate   (5, startDate);
            preparedStmt.setBoolean(6, false);

            // execute the preparedstatement
            preparedStmt.execute();

            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
    public static boolean isValid(String password) {
        if (password.length() < 8) {
            return false;
        }
        return true;
    }
}