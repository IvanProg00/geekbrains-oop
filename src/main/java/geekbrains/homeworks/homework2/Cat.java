package geekbrains.homeworks.homework2;

public class Cat implements Movement {
    @Override
    public void run() {
        System.out.println("Cat runs");
    }

    @Override
    public void jump() {
        System.out.println("Cat jumps");
    }
}
