package geekbrains.homeworks.homework3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        NumberGame numberGame = new NumberGame();
        Scanner scanner = new Scanner(System.in);
        Logger logger = new Logger();

        numberGame.start(scanner.nextInt(), scanner.nextInt(), logger);
        logger.write("game started");

        scanner.nextLine();

        while (!numberGame.getGameStatus().equals(GameStatus.FINISH)) {
            String value = scanner.nextLine();
            logger.write("User wrote " + value);

            Answer answer = numberGame.inputValue(value);
        }

        System.out.print("Would you like see game history? [Y\\n] ");
        String showHistory = scanner.nextLine();

        if (showHistory.equalsIgnoreCase("y")) {
            System.out.println(logger);
        }
    }
}
