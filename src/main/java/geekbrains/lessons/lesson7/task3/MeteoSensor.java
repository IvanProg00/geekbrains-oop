package geekbrains.lessons.lesson7.task3;

import java.time.LocalDateTime;

public interface MeteoSensor {
    int getId();

    Float getTemperature();

    Float getHumidity();

    Float getPressure();

    LocalDateTime getDateTime();
}
