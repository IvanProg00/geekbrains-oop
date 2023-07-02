package geekbrains.lessons.lesson1.task2;

public class SavingAccount extends Account {
    private final Double savingPercent;

    public SavingAccount(Integer number, String owner, Double balance, Double savingPercent) {
        super(number, owner, balance);
        this.savingPercent = savingPercent;
    }

    public void calculatedInterest() {
        Double result = getBalance() * savingPercent / 100;
        deposit(result);
    }
}
