package geekbrains.lessons.lesson2.task2;

public class Skate implements Transport {
    @Override
    public void run() {
        System.out.println("Skate rides");
    }

    @Override
    public void stop() {
        System.out.println("Skate stopped");
    }
}
