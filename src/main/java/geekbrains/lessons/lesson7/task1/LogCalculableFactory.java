package geekbrains.lessons.lesson7.task1;

public class LogCalculableFactory implements ICalculableFactory {
    private final Logable logger;

    public LogCalculableFactory(Logable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}
