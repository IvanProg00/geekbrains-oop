package geekbrains.homeworks.homework2;

public class Cat implements Movement {
    private final Integer maxJumpHeight;
    private final Integer maxRunLength;

    public Cat(Integer maxJumpHeight, Integer maxRunLength) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public Integer run() {
        System.out.println("Cat runs");

        return maxRunLength;
    }

    @Override
    public Integer jump() {
        System.out.println("Cat jumps");

        return maxJumpHeight;
    }
}
