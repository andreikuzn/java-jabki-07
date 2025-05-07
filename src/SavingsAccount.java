public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        if (interestRate < 0) {
            throw new IllegalArgumentException("Процентная ставка не может быть отрицательной");
        }
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

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
    }

    @Override
    public void displayInfo() {
        System.out.printf("Счет: %s, Баланс: %.2f, Тип: SavingsAccount, Процент по вкладу: %.2f%%%n",
                getAccountNumber(), getBalance(), interestRate * 100);
    }
}

