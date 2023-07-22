package geekbrains.homeworks.homework6.service;

import geekbrains.homeworks.homework6.model.Student;
import geekbrains.homeworks.homework6.model.Teacher;
import geekbrains.homeworks.homework6.model.Type;
import geekbrains.homeworks.homework6.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IDataService {
    private final List<User> userList = new ArrayList<>();

    @Override
    public void create(String name, String surname, Type type) {
        int id = getFreeId(type);

        if (type == Type.STUDENT) {
            Student student = new Student(name, surname, id);
            userList.add(student);
        }

        if (type == Type.TEACHER) {
            Teacher teacher = new Teacher(name, surname, id);
            userList.add(teacher);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 0;

        boolean isStudent = type == Type.STUDENT;

        for (User user : userList) {
            if (user instanceof Teacher && !isStudent) {
                lastId++;
            }

            if (user instanceof Student && isStudent) {
                lastId++;
            }
        }

        return lastId + 1;
    }

    @Override
    public List<User> read() {
        return userList;
    }

    @Override
    public List<User> readOnlyStudents() {
        List<User> students = new ArrayList<>();

        for (User user : userList) {
            if (user instanceof Student) {
                students.add(user);
            }
        }

        return students;
    }
}
