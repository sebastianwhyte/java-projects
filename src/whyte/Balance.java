package whyte;

import java.text.*;
;

public class Balance {

    private float current_balance;
    public static float bal;
    char choice;

    Input input = new Input();

    NumberFormat formatter = new DecimalFormat("#0.00");


    public void viewBalance(BankAccount bankAccount) {


        System.out.println("Your current account balance is: " + formatter.format(bal));

        System.out.print("Would you like to go back to the main menu? Type 'y' for yes and 'n' to quit. ");
        choice = input.scan.next().charAt(0);


        switch (choice) {
            case 'y':
                bankAccount.showMenu();

            case 'n':
                break;

            default:
                System.out.println("Invalid option.");
        }
    }

    public void setBalance(float b) {
        if (b >= 0.00f) {
            current_balance = b;
        }
    }

    public float getBalance() {
        return current_balance;
    }

}
