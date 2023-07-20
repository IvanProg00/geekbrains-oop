package geekbrains.homeworks.homework6;

import geekbrains.homeworks.homework6.controller.StudentController;
import geekbrains.homeworks.homework6.service.IDataService;
import geekbrains.homeworks.homework6.service.UserService;
import geekbrains.homeworks.homework6.view.StudentView;
import geekbrains.homeworks.homework6.view.View;

public class App {
    public static void main(String[] args) {
        IDataService dataService = new UserService();
        View view = new StudentView();

        StudentController studentController = new StudentController(dataService, view);
        studentController.createStudent("student 1", "student surname 1");
        studentController.createStudent("student 2", "student surname 2");
        studentController.createStudent("student 3", "student surname 3");

        studentController.getAllStudents();
    }
}
