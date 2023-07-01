package geekbrains.lessons.lesson1.task1;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Animal named " + this.name);
    }

    public void voice() {
        System.out.println("Animal named " + this.name + " makes a sound");
    }

    public void jump() {
        System.out.println("Animal named " + this.name + " jumps");
    }
}
