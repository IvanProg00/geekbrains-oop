package geekbrains.lessons.lesson7.task1;

public class LogCalculator implements Calculable {
    private final Calculable decorated;
    private final Logable logable;

    public LogCalculator(Calculable decorated, Logable logable) {
        this.decorated = decorated;
        this.logable = logable;
    }

    @Override
    public Calculable sum(int arg) {
        logable.log("Called method sum with parameter " + arg);
        return decorated.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logable.log("Called method multi with parameter " + arg);
        return decorated.multi(arg);
    }

    @Override
    public int getResult() {
        logable.log("Called method getResult");
        return decorated.getResult();
    }
}
