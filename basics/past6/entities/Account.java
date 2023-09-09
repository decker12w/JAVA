package past6.entities;

public abstract class Account {
    private Integer number;
    private String Holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer number, String Holder, Double balance) {
        this.number = number;
        this.Holder = Holder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return this.Holder;
    }

    public void setHolder(String Holder) {
        this.Holder = Holder;
    }

    public Double getBalance() {
        return this.balance;
    }

}
