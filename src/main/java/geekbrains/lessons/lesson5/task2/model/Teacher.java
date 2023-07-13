package geekbrains.lessons.lesson5.task2.model;

public class Teacher extends User {
    int teacherId;

    public Teacher(String name, String surname, int teacherId) {
        super(name, surname);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
