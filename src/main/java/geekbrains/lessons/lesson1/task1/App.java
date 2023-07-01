package geekbrains.lessons.lesson1.task1;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "orange", 21);
        Cat cat2 = new Cat("Murka", "red", 11);

        cat1.setAge(5);
        cat2.setAge(-3);
        System.out.println("cat1 = " + cat1);
        System.out.println("cat2 = " + cat2);

        cat1.animalInfo();
        cat1.voice();
        cat1.jump();
    }
}
