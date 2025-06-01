public class SavingsAccount extends BankAccount{
    // attributes
    private double interestRate;

    // parametarized constructors
    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(double interestRate, double balance) {
        super(balance);
        this.interestRate = interestRate;
    }

    // setters
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // getters
    public double getInterestRate() {
        return interestRate;
    }

    // other methods
    public void addCompoundInterest(){
        double interest = balance * (interestRate / 100.0);
        deposit(interest);
    }
}
