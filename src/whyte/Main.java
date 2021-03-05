package whyte;

import java.io.*;   // Use for text files
import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.SQLException;


public class Main {

    public static void main(String[] args) {
	// write your code here


        Login login = new Login();
        login.makeAccount();



        // Try to connect to database anonomously (without exposing username and password)
       /*
       String firstName = "John";
       String lastName = "Miller";

       try {
           //Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/bankdb");
           PreparedStatement posted = connection.prepareStatement("INSERT INTO users (first_name, last_name) VALUES ('"+firstName+"', '"+lastName+"')");
           posted.executeUpdate();
           System.out.println("Successful");

       } catch (SQLException except) {
           except.printStackTrace();
           System.out.println("Error");
       }
       */



        // Scanner scan = new Scanner(System.in// Setter method will accept user input and match it against criteria
        // If user input is accepted, then Getter method will return the result and it will be printed

        // System.out.println("Welcome to My Bank.\n" +
        //                   "Please enter a username:");

        /*
        login.setUserName(scan.next());

        System.out.println("Hello, " + login.getUserName() + "\n");

        // Password
        System.out.println("Please enter a password, that is between 6-10 characters: ");
        login.setPassword(scan.next().trim());
        System.out.println("Your password is set to: " + login.getPassword());
        */
    }
}
