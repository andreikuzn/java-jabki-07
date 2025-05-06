public class CreditAccount extends Account {
    private double creditLimit;

    public CreditAccount(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        if (creditLimit < 0) {
            throw new IllegalArgumentException("Кредитный лимит не может быть отрицательным");
        }
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.withdraw(amount)) {
            return true;
        }
        double totalAvailable = getBalance() + creditLimit;
        if (amount > 0 && totalAvailable >= amount) {
            double overdraftNeeded = amount - getBalance();
            setBalance(0);
            System.out.printf("Средства на счету %s закончились, использован овердрафт\n", getAccountNumber());
            creditLimit -= overdraftNeeded;
            return true;
        } else {
            System.out.println("Кредитный лимит превышен");
            return false;
        }
    }

    @Override
    public void displayInfo() {
        System.out.printf("Счет: %s, Баланс: %.2f, Тип: CreditAccount, Кредитный лимит: %.2f%n",
                getAccountNumber(), getBalance(), creditLimit);
    }

}
