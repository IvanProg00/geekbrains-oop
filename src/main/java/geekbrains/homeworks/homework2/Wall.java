package geekbrains.homeworks.homework2;

public class Wall {
    private Integer height;

    public Wall(Integer height) {
        this.height = height;
    }

    public void start(Movement m) {
        if (m.jump() > height) {
            System.out.println("Successfully jumped over");
        } else {
            System.out.println("Didn't jump over");
        }
    }
}
