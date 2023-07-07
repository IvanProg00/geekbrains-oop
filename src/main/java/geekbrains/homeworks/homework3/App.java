package geekbrains.homeworks.homework3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Game game = new EnglishGame();
        Scanner scanner = new Scanner(System.in);
        Logger logger = new Logger();

        System.out.print("Enter word size: ");
        int wordSize = scanner.nextInt();

        System.out.print("Enter maximum number of tries: ");
        int maxTry = scanner.nextInt();

        game.start(wordSize, maxTry, logger);

        scanner.nextLine();

        while (!game.getGameStatus().equals(GameStatus.FINISH)) {
            System.out.print("Write word: ");
            String value = scanner.nextLine();
            logger.write("User wrote " + value);

            Answer answer = game.inputValue(value);

            if (answer != null) {
                System.out.print("Would you like to restart? [Y\\n] ");
                if (scanner.nextLine().equalsIgnoreCase("y")) {
                    System.out.print("Enter word size: ");
                    wordSize = scanner.nextInt();

                    System.out.print("Enter maximum number of tries: ");
                    maxTry = scanner.nextInt();

                    game.restart(wordSize, maxTry);
                    scanner.nextLine();
                }
            }
        }

        System.out.print("Would you like see game history? [Y\\n] ");
        String showHistory = scanner.nextLine();

        if (showHistory.equalsIgnoreCase("y")) {
            System.out.println(logger);
        }
    }
}
