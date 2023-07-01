package geekbrains.lessons.lesson1.task2;

public class App {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount(12, "Ivan", 2000., 20.);
        SavingAccount savingAccount = new SavingAccount(10, "John", 1000., 10.);

        System.out.println("creditAccount.getBalance() = " + creditAccount.getBalance());
        creditAccount.calculatedInterest();
        System.out.println("creditAccount.getBalance() = " + creditAccount.getBalance());

        System.out.println("savingAccount.getBalance() = " + savingAccount.getBalance());
        savingAccount.calculatedInterest();
        System.out.println("savingAccount.getBalance() = " + savingAccount.getBalance());
    }
}
