public class CreditAccount extends Account {

    private double creditLimit;

    public CreditAccount(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= -creditLimit) {
            setBalance(getBalance() - amount);
            return true;
        } else {
            System.out.println("Кредитный лимит превышен");
            return false;
        }
    }
}
