package geekbrains.lessons.lesson6;

public class BookGenre implements Genre {
    private final String genre;

    public BookGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
