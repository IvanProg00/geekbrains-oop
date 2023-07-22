package geekbrains.lessons.lesson7.task2;

import java.util.Random;

public class Junior implements Observer {
    private final String name;

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (new Random().nextBoolean()) {
            System.out.printf("Junior %s: I am waiting for the better job! (company, salary) = %s, %d%n", name, nameCompany, salary);
        } else {
            System.out.printf("Junior %s: Ok. I am ready for this job! (company, salary) = %s, %d%n", name, nameCompany, salary);
        }
    }
}
