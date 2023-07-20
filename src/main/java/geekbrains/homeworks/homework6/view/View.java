package geekbrains.homeworks.homework6.view;

import geekbrains.homeworks.homework6.model.Student;

/*
Here I'm using "Open Closed Principle". Clients will connect from interface View,
but logic will be in classes, that implement it.
 */
public interface View {
    void printConsole(Student student);
}
