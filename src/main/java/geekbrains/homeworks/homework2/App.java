package geekbrains.homeworks.homework2;

public class App {
    public static void main(String[] args) {
        Player[] players = new Player[]{
                new Cat(10, 15),
                new Robot(4, 12),
                new Person(8, 34),
                new Robot(9, 18),
                new Person(18, 3),
                new Cat(99, 99),
        };

        Obstacle[] obstacles = new Obstacle[]{
                new Wall(4),
                new Treadmill(48),
                new Wall(19),
                new Treadmill(1),
        };

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + i);
            boolean isWon = true;

            for (Obstacle obstacle : obstacles) {
                if (!obstacle.passObstacle(players[i])) {
                    System.out.println("Player " + i + " lost");
                    isWon = false;
                    break;
                }
            }

            if (isWon) {
                System.out.println("Player " + i + " won");
            }
        }
    }
}
