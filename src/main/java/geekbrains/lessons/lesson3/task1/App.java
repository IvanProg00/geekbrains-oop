package geekbrains.lessons.lesson3.task1;

public class App {
    public static void main(String[] args) {
        Month month = Month.JAN;

        Calendar calendar = new Calendar(month);
        System.out.println(calendar.getMonth());
    }
}
