package geekbrains.homeworks.homework3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<String> history;

    public Logger() {
        history = new ArrayList<>();
    }

    public void write(String message) {
        history.add(LocalDateTime.now() + ": " + message);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (String s : history) {
            result.append(s).append('\n');
        }

        return result.toString();
    }
}
