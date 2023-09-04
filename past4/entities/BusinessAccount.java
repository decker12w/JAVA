package past4.entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount() {
    }

    public BusinessAccount(Integer number, String Holder, Double balance, Double loanLimit) {
        super(number, Holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return this.loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2;
    }
}