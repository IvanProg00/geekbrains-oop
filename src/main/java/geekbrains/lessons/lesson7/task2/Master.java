package geekbrains.lessons.lesson7.task2;

public class Master implements Observer {
    String name;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (salary < 80) {
            System.out.printf("Master %s: I am waiting for the better job! (company, salary) = %s, %d%n", name, nameCompany, salary);
        } else {
            System.out.printf("Master %s: Ok. I am ready for this job! (company, salary) = %s, %d%n", name, nameCompany, salary);
        }
    }
}
