package whyte;


public class BankAccount {

    private int choice;
    public boolean flag = false;

    Balance view_balance = new Balance();
    Deposit deposit = new Deposit();
    Withdraw withdraw = new Withdraw();
    Input input = new Input();


    public void showMenu() {
        System.out.println("\nThese are the available options: \n");

        System.out.println("====================\n" +
                "\t\tMENU\n" +
                "=====================\n");

        System.out.println("1. View Balance\n" +
                "2. Deposit\n" +
                "3. Withdraw\n" +
                "4. Quit\n");


        while (!flag) {
            System.out.print("Please enter the number of your choice: ");

            // Using scanner from "Login" class
            setChoice(input.scan.nextInt());

            switch (choice) {
                case 1:
                    System.out.println("You selected VIEW BALANCE.\n");
                    view_balance.viewBalance(this);
                    flag = true;
                    break;

                case 2:
                    System.out.println("You selected DEPOSIT.\n");
                    deposit.makeDeposit(this);
                    flag = true;
                    break;

                case 3:
                    System.out.println("You selected WITHDRAW.\n");
                    withdraw.doWithdraw(this);
                    flag = true;
                    break;

                case 4:
                    System.out.println("You selected QUIT.");
                    System.out.println("Thank you for your business. Goodbye!");
                    flag = true;
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
    }

    public int getChoice() {
        return choice;
    }

}
