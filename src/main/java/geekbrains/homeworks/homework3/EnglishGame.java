package geekbrains.homeworks.homework3;

import java.util.ArrayList;
import java.util.List;

public class EnglishGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();

        for (int i = 65; i <= 90; i++) {
            result.add(String.valueOf((char) i));
        }

        for (int i = 97; i <= 122; i++) {
            result.add(String.valueOf((char) i));
        }

        return result;
    }
}
