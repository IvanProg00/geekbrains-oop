package geekbrains.homeworks.homework2;

public class Robot implements Player {
    private final Integer maxJumpHeight;
    private final Integer maxRunLength;

    public Robot(Integer maxJumpHeight, Integer maxRunLength) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }

    public Integer run() {
        System.out.println("Robot runs");

        return maxRunLength;
    }

    public Integer jump() {
        System.out.println("Robot jumps");

        return maxJumpHeight;
    }
}
