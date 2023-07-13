package geekbrains.lessons.lesson5.task2.controller;

import geekbrains.lessons.lesson5.task2.model.Student;
import geekbrains.lessons.lesson5.task2.model.Type;
import geekbrains.lessons.lesson5.task2.model.User;
import geekbrains.lessons.lesson5.task2.service.UserService;
import geekbrains.lessons.lesson5.task2.view.StudentView;

import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String name, String surname) {
        userService.create(name, surname, Type.STUDENT);
    }

    public void getAllStudents() {
        List<User> studentList = userService.readOnlyStudents();

        for (User user : studentList) {
            Student student = (Student) user;
            studentView.printConsole(student);
        }
    }
}
