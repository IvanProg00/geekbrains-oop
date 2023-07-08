package geekbrains.lessons.lesson4.task1;

public class App {
    public static void main(String[] args) {
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);

        int sum1 = 0;
        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
            sum1 = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
        }

        System.out.println("sum1 = " + sum1);

        GenBox<Integer> gen1 = new GenBox<>(10);
        GenBox<Integer> gen2 = new GenBox<>(20);

        int sum2 = gen1.getObj() + gen2.getObj();

        System.out.println("sum2 = " + sum2);
    }
}
