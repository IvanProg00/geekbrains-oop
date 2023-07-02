package geekbrains.lessons.lesson2.task1;

public class HouseCat extends Cat {
    protected static int count;

    public HouseCat(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, type, maxRunDistance, maxSwimDistance);
        count++;
    }
}
