package geekbrains.homeworks.homework6.model;

/*
Here we use "Liskov’s Substitution Principle". We are inherit from parent "User".
 */
public class Student extends User {
    private int studentId;

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
