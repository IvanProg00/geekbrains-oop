package geekbrains.lessons.lesson3.task3;

public interface Game {
    void start(Integer sizeWord, Integer maxTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();
}
