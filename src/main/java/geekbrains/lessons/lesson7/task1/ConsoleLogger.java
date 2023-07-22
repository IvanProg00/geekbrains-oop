package geekbrains.lessons.lesson7.task1;

public class ConsoleLogger implements Logable {
    @Override
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
