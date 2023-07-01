package geekbrains.lessons.lesson1.task1;

public class Cat extends Animal {
    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("age entered incorrectly");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("age entered incorrectly");
        }
    }

    @Override
    public void animalInfo() {
        System.out.println("Cat named " + super.getName());
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + super.getName() + '\'' + ", color='" + color + '\'' + ", age=" + age + '}';
    }
}
