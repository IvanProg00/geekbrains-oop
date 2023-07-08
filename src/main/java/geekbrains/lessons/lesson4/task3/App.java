package geekbrains.lessons.lesson4.task3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            doubleList.add((double) i);
            integerList.add(i * 3);
        }

        System.out.println("calc.sum(doubleList) = " + calc.sum(doubleList));
        System.out.println("calc.sum(integerList) = " + calc.sum(integerList));
    }
}
