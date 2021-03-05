package whyte;


// NOW SEE IF YOU CAN SAVE THE USERNAME AND PASSWORD INTO A TEXT FILE TO USE AS LOGIN
public class BankAccount {

    private float balance;
    private int bonus;
    private int choice;
    public boolean flag = false;

    Balance view_balance = new Balance();
    Deposit deposit = new Deposit();
    Input input = new Input();


    // In order to ACCESS "Login" CLASS, MAKE AN INSTANCE as a PARAMETER
    public void showMenu() {
        System.out.println("\nThese are the available options: \n");

        System.out.println("====================\n" +
                "\t\tMENU\n" +
                "=====================\n");

        System.out.println("1. View Balance\n" +
                "2. Deposit\n" +
                "3. Withdraw\n" +
                "4. Quit\n");

        /*System.out.print("Please enter the number of your choice: ");

        // Using scanner from "Login" class
        setChoice(input.scan.nextInt()); */

        while (!flag) {
            System.out.print("Please enter the number of your choice: ");

            // Using scanner from "Login" class
            setChoice(input.scan.nextInt());

            switch (choice) {
                case 1:
                    System.out.println("You selected VIEW BALANCE");
                    view_balance.viewBalance();
                    flag = true;
                    break;

                case 2:
                    System.out.println("You selected DEPOSIT\n");
                    deposit.makeDeposit(this);
                    flag = true;
                    break;

                case 3:
                    System.out.println("You selected WITHDRAW");
                    // withdraw();
                    break;

                case 4:
                    System.out.println("You selected QUIT");
                    //quit();
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }


    public void setChoice(int choose) {
        if (choose == 1 || choose == 2 || choose == 3 || choose == 4) {
            choice = choose;
        }
        /*else {
            System.out.println("Invalid choice");
        }*/
    }

    public int getChoice() {
        return choice;
    }

}

