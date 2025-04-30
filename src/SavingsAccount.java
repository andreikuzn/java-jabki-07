public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 1000) {
            System.out.println("Лимит снятия превышен (макс 1000).");
            return false;
        }
        return super.withdraw(amount);
    }

    @Override
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
    }
}
