package whyte;

import java.text.*;
import java.util.*;


public class Deposit {

    private float amount;
    char choice;

    Balance balance = new Balance();
    Input input = new Input();

    NumberFormat formatter = new DecimalFormat("#0.00");


    public void makeDeposit(BankAccount bankAccount) {

        boolean flag = true;
        System.out.println("Your current balance is: " + formatter.format(balance.getBalance()));

        while (flag) {

            System.out.print("How much would you like to deposit? ");
            amount = input.scan.nextFloat();
            System.out.println("");

            try {

                if (amount > 0) {
                    setDepositAmount(amount);
                    flag = false;
                    break;
                }
                else if (amount == 0) {
                    System.out.println("You haven't deposited anything.");
                }
                else {
                    System.out.println("Invalid input.");
                }
            }
            catch (InputMismatchException exception) {
                System.out.println("Invalid input.");
            }
        }

        balance.bal += amount;

        balance.setBalance(balance.bal);


        System.out.println("You deposited: " + formatter.format(amount) + ". Your current balance is now " +
                formatter.format(balance.bal) + ".\nWould you like to go back to the main menu? Type 'y' for yes and 'n' to quit. ");

        choice = input.scan.next().charAt(0);


        switch (choice) {
            case 'y':
                bankAccount.showMenu();
                break;
            case 'n':
                break;
            default:
                System.out.println("Invalid option");
        }
    }


    public void setDepositAmount(float a) {
        if (a > 0) {
        amount = a;
        }
    }


    public float getAmount() {
        return amount;
    }
}