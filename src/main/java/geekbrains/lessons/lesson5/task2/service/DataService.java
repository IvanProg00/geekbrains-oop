package geekbrains.lessons.lesson5.task2.service;

import geekbrains.lessons.lesson5.task2.model.Type;
import geekbrains.lessons.lesson5.task2.model.User;

import java.util.List;

public interface DataService {
    void create(String name, String surname, Type type);
    List<User> read();

    List<User> readOnlyStudents();
}
