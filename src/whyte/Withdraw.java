package whyte;

import java.text.*;;


public class Withdraw {

    boolean flag;
    float withdrawal_amount;
    char choice;


    Balance balance = new Balance();
    Input input = new Input();

    NumberFormat formatter = new DecimalFormat("#0.00");


    void doWithdraw(BankAccount bankAccount) {

        if (balance.bal >= 0) {
            System.out.println("You currently have $" + formatter.format(balance.bal) + ".");

            while (!flag) {
                System.out.print("How much money would you like to withdrawal? ");
                withdrawal_amount = input.scan.nextFloat();
                System.out.println("");

                if (withdrawal_amount > 0 && withdrawal_amount <= balance.bal) {
                    balance.bal -= withdrawal_amount;

                    System.out.println("You now have " + formatter.format(balance.bal) + " remaining in your account.");
                    break;
                }
                else if (withdrawal_amount > balance.bal) {
                    System.out.println("You do not have enough funds in your account.");
                }
                else {
                    System.out.println("Invalid option.\n");
                }
            }
        }
        else {
            System.out.println("You don't have enough money to withdraw.");
        }

        System.out.print("Would you like to go back to the main menu? Type 'y' for yes and 'n' to quit. ");
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
}
