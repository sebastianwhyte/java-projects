package whyte;

public class Deposit {
    private float amount;
    public char goBackHome;

    
    Balance balance = new Balance();
    Input input = new Input();


    public void makeDeposit(BankAccount bankAccount) {

        System.out.println("Your current balance is: " + balance.getBalance() +
                " How much would you like to deposit? ");
        setDepositAmount(Float.parseFloat(input.scan.next()));

        //amount = input.scan.nextFloat();

        balance.bal += amount;

        balance.setBalance(balance.bal);


        System.out.println("You deposited: " + amount + ". Your current balance is now " + balance.bal);

        System.out.println("Would you like to go back to the main menu? Type 'y' for yes and 'n' to quit.");
        goBackHome = input.scan.next().charAt(0);


        switch (goBackHome) {
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
