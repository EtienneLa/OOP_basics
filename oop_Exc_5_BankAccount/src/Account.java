public class Account {

    private double balance;
    private String accountNumber;

    public Account(int bal, String acc) {

        if (bal > 100) {
            balance = bal;
            System.out.println("New balance: " + balance);
        }
        else
            System.out.println("Initial balance has to be at least 100.");

        accountNumber = acc;
    }

    public void deposit(double depo) {

        if (depo > 0) {
            balance += depo;
            System.out.println(depo + " has been added to balance." +
            "\n New balance: " + balance);
        }
        else
            System.out.println("Please ensure the amount to be deposited is not negative.");
    }

    public void withdraw(double withdr) {

        if (withdr > 0 && withdr < balance) {
            balance -= withdr;
            System.out.println(withdr + " has been successfully withdrawn." +
            "\nNew balance: " + balance);
        }
        else if (withdr < 0)
            System.out.println("Please ensure the amount to be withdrawn is not negative.");
        else if (withdr > balance)
            System.out.println("Amount to be withdrawn is higher than your balance.");
    }

    public String getAccDetails() {

        return "Account: " + accountNumber + "\nBalance: " + balance;
    }
}
