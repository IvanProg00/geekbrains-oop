package geekbrains.homeworks.homework2.task1;

public class App {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Animal animal = new Animal();
        Cat cat = new Cat();
        Person person = new Person();

        robot.jump();
        robot.run();
        animal.jump();
        animal.run();
        cat.jump();
        cat.run();
        person.jump();
        person.run();
    }
}
