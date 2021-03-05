package whyte;

public class Balance {

    private float current_balance;
    public static float bal;

    public void viewBalance() {


        System.out.println("Your current account balance is: " + bal);
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
