package geekbrains.lessons.lesson2.task2;

public class Car implements Transport {
    @Override
    public void run() {
        System.out.println("Car drives");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
