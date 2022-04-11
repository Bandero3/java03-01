package dayfour;

public class Student extends Person{
    private int studentId;

    public Student(Date birthday, String name, int studentId) {
        super(birthday, name);
        this.studentId = studentId;
    }

    public int getId(){
        return studentId;
    }
}
