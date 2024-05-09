public class TransactionsDriver {
    public static void main(String[] args) {
        SavingsAccount dadsSavings = new SavingsAccount(0.3);
        CheckingAccount kidsChecking = new CheckingAccount();

        dadsSavings.deposit(10000);
        dadsSavings.transferMoney(kidsChecking, 3000);

        kidsChecking.withdraw(200);
        kidsChecking.withdraw(400);
        kidsChecking.withdraw(300);
        kidsChecking.withdraw(500);
        kidsChecking.withdraw(400);

        dadsSavings.addCompoundInterest();
        kidsChecking.chargeFees();

        System.out.println("End of the period account balances:");
        System.out.print("Dad's savings. ");
        dadsSavings.display();
        System.out.print("Kid's checking. ");
        kidsChecking.display();
    }
}
