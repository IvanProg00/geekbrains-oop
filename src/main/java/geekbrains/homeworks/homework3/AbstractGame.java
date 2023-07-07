package geekbrains.homeworks.homework3;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    private Integer sizeWord;
    private Integer maxTry;
    private String computerWord;
    private GameStatus gameStatus = GameStatus.INIT;
    private Integer currentTry;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        computerWord = generateWord();
        System.out.println("computerWord = " + computerWord);
        this.gameStatus = GameStatus.START;
        this.currentTry = 0;
    }

    @Override
    public Answer inputValue(String value) {
        if (currentTry > maxTry) {
            gameStatus = GameStatus.FINISH;
            System.out.println("You are lost!!!");

            return null;
        }

        int bull = 0;
        int cow = 0;

        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == computerWord.charAt(i)) {
                bull++;
                cow++;
            } else if (computerWord.contains(String.valueOf(value.charAt(i)))) {
                cow++;
            }
        }

        currentTry++;

        if (sizeWord.equals(bull)) {
            gameStatus = GameStatus.FINISH;
            System.out.println("You won!!!");
            return null;
        }

        return new Answer(bull, cow, currentTry);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    abstract List<String> generateCharList();

    private String generateWord() {
        List<String> charList = generateCharList();
        StringBuilder result = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());

            result.append(charList.get(randomIndex));
            charList.remove(randomIndex);
        }

        return result.toString();
    }
}
