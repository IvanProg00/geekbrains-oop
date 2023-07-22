package geekbrains.lessons.lesson7.task3;

public class App {
    public static void main(String[] args) {
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        meteoDb.save(ms200_1);
        meteoDb.save(new AdapterST500Info(new ST500Info().getData()));
    }
}
