package past4.entities;

public final class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String Holder, Double balance, Double interestRate) {
        super(number, Holder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    public Double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

}
