package geekbrains.lessons.lesson6;

import java.util.List;

public class JSONFormatter implements Formatter {
    @Override
    public void formatted(List<Book> books) {
        for (Book book : books) {
            System.out.println(book + " formatted in " + Format.JSON);
        }
    }
}
