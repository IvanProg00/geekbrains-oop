package geekbrains.homeworks.homework6.view;

import geekbrains.homeworks.homework6.model.Student;

/*
Here I'm using "Open Closed Principle". Clients will connect from interface View,
but logic will be in class `StudentView`.
 */
public class StudentView implements View {
    public void printConsole(Student student) {
        System.out.println(student);
    }
}
