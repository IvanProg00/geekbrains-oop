package geekbrains.homeworks.homework3;

public interface Game {
    void start(Integer sizeWord, Integer maxTry, Logger logger);

    Answer inputValue(String value);

    GameStatus getGameStatus();

    void restart(Integer sizeWord, Integer maxTry);
}
