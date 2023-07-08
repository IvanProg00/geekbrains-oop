package geekbrains.lessons.lesson4.task2;

public class App {
    public static void main(String[] args) {
        BoxWithNumber<Integer> boxWithNumber = new BoxWithNumber(5, 7, 9);
        double average = boxWithNumber.average();

        System.out.println("average = " + average);
        BoxWithNumber<Integer> boxWithNumber2 = new BoxWithNumber(3, 9, 5, 4);
        boolean isSameAverage = boxWithNumber2.compareAverage(boxWithNumber);

        System.out.println("isSameAverage = " + isSameAverage);
    }
}
