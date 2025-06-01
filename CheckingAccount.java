public class CheckingAccount extends BankAccount {
    // attributes
    private final int ALLOWED_TRANS = 2; // times
    private final int TRANS_FEE = 3; // dollars
    private static int transactionCount;

    // default constructor
    public CheckingAccount() {
        super();
        transactionCount = 0;
    }

    // parametarized constructor
    public CheckingAccount(double balance) {
        super(balance);
        transactionCount = 0;
    }

    // other methods
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        transactionCount++;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        transactionCount++;
    }

    public void chargeFees() {
        if (transactionCount > ALLOWED_TRANS) {
            double fees = (transactionCount - ALLOWED_TRANS) * TRANS_FEE;
            balance -= fees;
            System.out.println("Transaction fees charged: $" + fees);
        }
    }
}
