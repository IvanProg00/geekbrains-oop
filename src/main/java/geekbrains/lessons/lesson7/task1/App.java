package geekbrains.lessons.lesson7.task1;

public class App {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
