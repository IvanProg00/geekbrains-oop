package geekbrains.homeworks.homework6.controller;

import geekbrains.homeworks.homework6.model.Student;
import geekbrains.homeworks.homework6.model.Type;
import geekbrains.homeworks.homework6.model.User;
import geekbrains.homeworks.homework6.service.IDataService;
import geekbrains.homeworks.homework6.view.View;

import java.util.List;

/*
Here we use "Single Responsibility Principle". In this controller, we only work with
students, if we will need to work with buildings or something else we will create
another controller (BuildingController).
 */
public class StudentController {
    /*
    Here we use "Dependency Inversion Principle". In this controller we use
    interfaces "DataService" and "View", and these interfaces implements "UserService" and "StudentView".
     */
    private final IDataService dataService;
    private final View view;

    public StudentController(IDataService dataService, View view) {
        this.dataService = dataService;
        this.view = view;
    }

    public void createStudent(String name, String surname) {
        dataService.create(name, surname, Type.STUDENT);
    }

    public void getAllStudents() {
        List<User> studentList = dataService.readOnlyStudents();

        for (User user : studentList) {
            Student student = (Student) user;
            view.printConsole(student);
        }
    }
}
