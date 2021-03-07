package whyte;

public class Login {

    private String userName, password;
    public String user_login, pass_login;
    boolean running = true;


    public void makeAccount () {

        BankAccount bank_account = new BankAccount();
        Input input = new Input();

        System.out.print("Welcome to MY BANK.\n" +
                "You have to make an account to get started. NOTE: Characters are case sensitive\n\n" +
                "Please enter a username: ");

        setUserName(input.scan.next());


        System.out.print("Please enter a password, that is between 6-10 characters: ");
        setPassword(input.scan.next().trim());


        System.out.print("\nPlease log in.\n" + "Enter username: ");
        user_login = input.scan.next();


        System.out.print("Enter password: ");
        pass_login = input.scan.next();


        if (user_login.equals(userName) && pass_login.equals(password)) {
            System.out.println("ACCESS GRANTED");
            bank_account.showMenu();
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
    public void setPassword(String pass) {

        if (pass.length() >= 6 && pass.length() <= 10) {
            password = pass;
        }
        else {
            System.out.println("Invalid password");
        }

    }


    // Password Getter
    public String getPassword() {
        return password;
    }

}
