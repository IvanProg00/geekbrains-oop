package geekbrains.homeworks.homework2;

public class Wall implements Obstacle {
    private final Integer height;

    public Wall(Integer height) {
        this.height = height;
    }

    public Boolean passObstacle(Player m) {
        if (m.jump() > height) {
            System.out.println("Successfully jumped over");
            return true;
        } else {
            System.out.println("Didn't jump over");
            return false;
        }
    }
}
