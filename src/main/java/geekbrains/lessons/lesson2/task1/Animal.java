package geekbrains.lessons.lesson2.task1;

public class Animal {
    protected static int count;
    protected String name;
    protected String type;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(String name, String type, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.name = name;
        this.type = type;
        if (type.equals("Cat")) {
            if (maxRunDistance > 200) this.maxRunDistance = 200;
            this.maxSwimDistance = maxSwimDistance;
        } else {
            if (maxRunDistance > 500) this.maxRunDistance = maxRunDistance;
            if (maxSwimDistance > 10) this.maxSwimDistance = maxSwimDistance;
        }
    }

    protected void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Animal " + name + " run distance " + distance + " km");
        } else {
            System.out.println("Animal " + name + " didn't run distance " + distance + " km");
        }
    }

    protected void swim(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Animal " + name + " swam distance " + distance + " km");
        } else {
            System.out.println("Animal " + name + " didn't swim distance " + distance + " km");
        }
    }
}
