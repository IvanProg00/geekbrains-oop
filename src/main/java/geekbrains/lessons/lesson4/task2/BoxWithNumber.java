package geekbrains.lessons.lesson4.task2;

import lombok.Data;

@Data
public class BoxWithNumber<E extends Number> {
    private E[] nums;

    public BoxWithNumber(E... nums) {
        this.nums = nums;
    }

    public double average() {
        double result = 0;

        for (E num : nums) {
            result += num.doubleValue();
        }

        return result / nums.length;
    }

    public boolean compareAverage(BoxWithNumber<E> boxWithNumber) {
        return this.average() == boxWithNumber.average();
    }
}
