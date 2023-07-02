package geekbrains.lessons.lesson2.task2;

public class Bicycle implements Transport {
    @Override
    public void run() {
        System.out.println("Bicycle rides");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stopped");
    }
}
