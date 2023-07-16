package geekbrains.lessons.lesson6;

public class Book {
    private String name;
    private String author;
    private Integer age;
    private final BookGenre bookGenre;

    public Book(String name, String author, Integer age, BookGenre bookGenre) {
        this.name = name;
        this.author = author;
        this.age = age;
        this.bookGenre = bookGenre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", age=" + age +
                ", bookGenre=" + bookGenre +
                '}';
    }
}
