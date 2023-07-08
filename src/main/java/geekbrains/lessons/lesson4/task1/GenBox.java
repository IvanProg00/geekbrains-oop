package geekbrains.lessons.lesson4.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GenBox<T> {
    T obj;
}
