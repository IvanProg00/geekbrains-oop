package geekbrains.lessons.lesson5.task2.model;

public class Student extends User {
    int studentId;

    public Student(String name, String surname, int studentId) {
        super(name, surname);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
