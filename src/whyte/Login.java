package whyte;

import java.util.*;
import java.io.Console;

// IF USERNAME AND PASSWORD MATCH, GRANT ACCESS AND MOVE TO BANK ACCOUNT CLASS

public class Login {

    private String userName, password;
    public String user_login, pass_login;
    boolean running = true;

    //public Scanner scan = new Scanner(System.in);


    enum AccountType {

    }


    public void makeAccount () {

        BankAccount bank_account = new BankAccount();
        Input input = new Input();

        System.out.print("Welcome to MY BANK.\n" +
                "You have to make an account to get started. NOTE: Characters are case sensitive\n\n" +
                "Please enter a username: ");

        setUserName(input.scan.next());

        //System.out.println("Hello, " + getUserName() + "\n");

        System.out.print("Please enter a password, that is between 6-10 characters: ");
        setPassword(input.scan.next().trim());

        //System.out.println("Your password is set to: " + getPassword());

        Console console = System.console();
        System.out.print("\nPlease log in.\n" + "Enter username: ");
        user_login = input.scan.next();


        System.out.print("Enter password: ");
        pass_login = input.scan.next();


        if (user_login.equals(userName) && pass_login.equals(password)) {
            System.out.println("ACCESS GRANTED");
            //bank_account.showMenu();
            bank_account.showMenu();    // In order to access the "Bank Account" class, MAKE an INSTANCE and INCLUDE "this" in PARAMETER
        }
        else {
            System.out.println("ACCESS DENIED");
        }

    }


    // Username Setter
    public void setUserName(String user) {


        while (running) {

            if (user != null) {
                this.userName = user;
                break;
            }
            else {
                System.err.println("You must type in a user name.");
            }
        }
    }


    // Username Getter
    public String getUserName() {
        return userName;
    }


    // Password Setter
    // TRY TO MAKE WHILE LOOP THAT KEEPS ASKING FOR PASSWORD IF IT DOESNT MEET CRITERIA
    public void setPassword(String pass) {

        if (pass.length() >= 6 && pass.length() <= 10) {
            this.password = pass;
        }
        else {
            System.out.println("Invalid password");
        }

    }

    public String getPassword() {
        return password;
    }


    /*

    // Show Menu
    public void showMenu() {
        System.out.println("\nThese are the available options: \n");

        System.out.println("====================\n" +
                "\t\tMENU\n" +
                "=====================");

        System.out.println("Please enter the number of your choice: ");
        setChoice(scan.nextInt());
    }


    public void setChoice(int choose) {
        if (choose == 1 || choose == 2 || choose == 3 || choose == 4) {
            choice = choose;
        }
        else {
            System.out.println("Invalid choice");
        }
    }

    public int getChoice() {
        return choice;
    }

     */
}
