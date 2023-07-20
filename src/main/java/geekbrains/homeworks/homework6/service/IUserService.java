package geekbrains.homeworks.homework6.service;

import geekbrains.homeworks.homework6.model.Type;
import geekbrains.homeworks.homework6.model.User;

import java.util.List;

/*
Here I use "Interface Segregation Principle". If I need interface to work only with users.
 */
public interface IUserService {
    void create(String name, String surname, Type type);

    List<User> read();
}
