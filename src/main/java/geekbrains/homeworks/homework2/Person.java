package geekbrains.homeworks.homework2;

public class Person implements Player {
    private final Integer maxJumpHeight;
    private final Integer maxRunLength;

    public Person(Integer maxJumpHeight, Integer maxRunLength) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public Integer run() {
        System.out.println("Person runs");

        return maxRunLength;
    }

    @Override
    public Integer jump() {
        System.out.println("Person jumps");

        return maxJumpHeight;
    }
}
