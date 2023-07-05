package geekbrains.homeworks.homework2;

public class Person implements Movement {
    @Override
    public void run() {
        System.out.println("Person runs");
    }

    @Override
    public void jump() {
        System.out.println("Person jumps");
    }
}
