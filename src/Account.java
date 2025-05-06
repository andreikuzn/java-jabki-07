public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isBlank() || balance < 0) {
            throw new IllegalArgumentException("Некорректные данные для счета: " +
                    "номер счета не может быть пустым или баланс отрицательным");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть положительной");
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void displayInfo() {
        System.out.printf("Счет: %s, Баланс: %.2f, Тип: %s%n",
                accountNumber, balance, this.getClass().getSimpleName());
    }
}
