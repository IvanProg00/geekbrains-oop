package geekbrains.homeworks.homework6.service;

import geekbrains.homeworks.homework6.model.User;

import java.util.List;


/*
Here I use "Interface Segregation Principle". If I need interface to work only with students.
 */
public interface IStudentService {
    List<User> readOnlyStudents();
}
