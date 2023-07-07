package geekbrains.lessons.lesson3.task2;

public class App {
    public static void main(String[] args) {
        Fruits fruit = Fruits.APPLE;

        sayFruit(fruit);
    }

    public static void sayFruit(Fruits fruit) {
        switch (fruit) {
            case APPLE -> System.out.println("Apple");
            case ORANGE -> System.out.println("Orange");
            case PEACH -> System.out.println("Peach");
            default -> System.out.println("Fruit not found");
        }

        System.out.println(fruit.getNumber());
    }
}
