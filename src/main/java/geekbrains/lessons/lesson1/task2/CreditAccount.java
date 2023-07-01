package geekbrains.lessons.lesson1.task2;

public class CreditAccount extends Account {
    private Double percent;

    public CreditAccount(Integer number, String owner, Double balance, Double percent) {
        super(number, owner, balance);
        this.percent = percent;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public void calculatedInterest() {
        Double result = getBalance() * this.percent / 100;
        withdraw(result);
    }
}
