package geekbrains.lessons.lesson5.task2;

import geekbrains.lessons.lesson5.task2.controller.Controller;

public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("student 1", "student surname 1");
        controller.createStudent("student 2", "student surname 2");
        controller.createStudent("student 3", "student surname 3");

        controller.getAllStudents();
    }
}
