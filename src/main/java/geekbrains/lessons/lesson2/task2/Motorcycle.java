package geekbrains.lessons.lesson2.task2;

public class Motorcycle implements Transport {
    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }

    @Override
    public void run() {
        System.out.println("Motorcycle drives");
    }
}
