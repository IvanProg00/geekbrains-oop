package geekbrains.lessons.lesson6;

public class ElectronBook extends Book {
    private String format;
    private Integer size;

    public ElectronBook(String name, String author, Integer age, BookGenre bookGenre, String format, Integer size) {
        super(name, author, age, bookGenre);
        this.format = format;
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
