package geekbrains.lessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        BookGenre bookGenre1 = new BookGenre("comedy");
        BookGenre bookGenre2 = new BookGenre("thriller");

        List<Book> books = new ArrayList<>(List.of(
                new Book("book1", "author 1", 1995, bookGenre1),
                new ElectronBook("book2", "author 2", 2000, bookGenre1, "pdf", 400),
                new Book("book3", "author 1", 2002, bookGenre2)
        ));

        Library library = new Library(books);

        List<Book> listByAuthor = library.searchAuthor("author 1");

        Formatter formatter = new HTMLFormatter();
        formatter.formatted(listByAuthor);
    }
}
