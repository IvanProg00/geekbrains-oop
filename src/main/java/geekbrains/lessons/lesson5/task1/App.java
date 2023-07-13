package geekbrains.lessons.lesson5.task1;

public class App {
    public static void main(String[] args) {
        Outer outer = new Outer(15);
        Outer.Inner inner = outer.new Inner(10);

        class Point {
            final int x;

            public Point(int x) {
                this.x = x;
            }

            @Override
            public String toString() {
                return "Point{" +
                        "x=" + x +
                        '}';
            }
        }

        Point point = new Point(3);
        System.out.println("point = " + point);

        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("We are flying!");
            }
        };

        flyable.fly();
    }
}
