package geekbrains.lessons.lesson7.task3;

import java.time.LocalDateTime;

public class AdapterST500Info implements MeteoSensor {
    private final SensorTemperature adapter;

    public AdapterST500Info(SensorTemperature data) {
        this.adapter = data;
    }

    @Override
    public int getId() {
        return adapter.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) adapter.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime result = LocalDateTime.of(adapter.year(), 1, 1, 0, 0).plusDays(adapter.day() - 1)
                .plusSeconds(adapter.second());
        return result;
    }
}
