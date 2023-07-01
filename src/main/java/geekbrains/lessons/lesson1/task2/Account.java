package geekbrains.lessons.lesson1.task2;

public class Account {
    private Integer number;
    private String owner;
    private Double balance;

    public Account(Integer number, String owner, Double balance) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    protected void deposit(Double amount) {
        this.balance += amount;
    }

    protected void withdraw(Double amount) {
        if (balance > amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in the account");
        }

    }
}
