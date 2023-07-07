package geekbrains.homeworks.homework2;

public class Treadmill implements Obstacle {
    private final Integer length;

    public Treadmill(Integer length) {
        this.length = length;
    }

    public Boolean passObstacle(Player m) {
        if (m.run() > length) {
            System.out.println("Successfully run");
            return true;
        } else {
            System.out.println("Didn't finish running");
            return false;
        }
    }
}
