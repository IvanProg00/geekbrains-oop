package geekbrains.homeworks.homework3;

import java.util.ArrayList;
import java.util.List;

public class RussianGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();

        for (int i = 1040; i <= 1103; i++) {
            result.add(String.valueOf((char) i));
        }

        return result;
    }
}
