package geekbrains.lessons.lesson2.task1;

public class App {
    public static void main(String[] args) {
        Animal[] animals = {
                new HouseCat("Barsik", "cat", 100, 23),
                new Dog("Bobik", "qwe", 10_000, 20_000),
                new Tiger("Tigra", "qwe", 100, 15),
                new Cat("Cat", "qwe", 10, 10),
        };

        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(20);
        }

        System.out.println("Animal.count = " + Animal.count);
        System.out.println("Cat.count = " + Cat.count);
        System.out.println("Tiger.count = " + Tiger.count);
        System.out.println("Dog.count = " + Dog.count);
        System.out.println("HouseCat.count = " + HouseCat.count);
    }
}
