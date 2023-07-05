package geekbrains.homeworks.homework2;

public class App {
    public static void main(String[] args) {
        Robot robot = new Robot(10, 20);
        Cat cat = new Cat(4, 10);
        Person person = new Person(15, 40);

        Wall wall = new Wall(11);
        Treadmill treadmill = new Treadmill(15);

        System.out.println("--- Wall ---");
        wall.start(robot);
        wall.start(cat);
        wall.start(person);

        System.out.println("--- Treadmill ---");
        treadmill.start(robot);
        treadmill.start(cat);
        treadmill.start(person);
    }
}
