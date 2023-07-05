package geekbrains.homeworks.homework2;

public class Treadmill {
    private Integer length;

    public Treadmill(Integer length) {
        this.length = length;
    }

    public void start(Movement m) {
        if (m.run() > length) {
            System.out.println("Successfully run");
        } else {
            System.out.println("Didn't finish running");
        }
    }
}
