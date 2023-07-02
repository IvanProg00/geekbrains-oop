package geekbrains.lessons.lesson2.task1;

public class Cat extends Animal {
    protected static int count;

    public Cat(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, "Cat", maxRunDistance, maxSwimDistance);
        count++;
    }
}
