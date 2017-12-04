package Mywork.Auth;

import java.lang.String;

public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String confirmPassword;

    public User( String firstName, String lastName, String username, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
    public boolean checkPassword (String password, String confirmPassword) {
        if (password.equals(confirmPassword)){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString () {
        return "User{" +
                "First Name: '" + firstName + '\'' +
                ", Last Name: '" + lastName + '\'' +
                ", Username: '" + username + '\'' +
                ", Password: " + password +
                '}';
    }
    public static void main (String[] args) {

    }
}
