package geekbrains.homeworks.homework4;

import java.util.List;

public class Calculator {
    public Double sum(List<? extends Number> numbers) {
        Double result = 0.;

        for (Number number : numbers) {
            result += number.doubleValue();
        }

        return result;
    }

    public Double multiplication(List<? extends Number> numbers) {
        Double result = 1.;

        for (Number number : numbers) {
            result *= number.doubleValue();
        }

        return result;
    }

    public Double division(List<? extends Number> numbers) {
        if (numbers.isEmpty()) {
            return 0.;
        }

        Double result = numbers.get(0).doubleValue();

        for (int i = 1; i < numbers.size(); i++) {
            result /= numbers.get(i).doubleValue();
        }

        return result;
    }
}
