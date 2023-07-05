package geekbrains.homeworks.homework2.task1;

public class Person extends Animal {
    @Override
    public void run() {
        System.out.println("Person runs");
    }

    @Override
    public void jump() {
        System.out.println("Person jumps");
    }
}
