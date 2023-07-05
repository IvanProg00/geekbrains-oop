package geekbrains.homeworks.homework2;

public class App {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Cat cat = new Cat();
        Person person = new Person();

        robot.jump();
        robot.run();
        cat.jump();
        cat.run();
        person.jump();
        person.run();
    }
}
