public class BankAccount {
    // attributes
    protected double balance;

    // default constructor
    public BankAccount() {
        this.balance = 0;
    }

    // parametarized constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // setters
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // getters
    public double getBalance() {
        return balance;
    }

    // other methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void transferMoney(BankAccount bankAccount, double amount) {
        if (balance >= amount) {
            withdraw(amount);
            bankAccount.deposit(amount);
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void display() {
        System.out.println("Account balance: " + balance);
    }
}
