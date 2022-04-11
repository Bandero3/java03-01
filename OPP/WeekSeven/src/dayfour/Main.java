package dayfour;


import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(1996,03,01);
        Student student = new Student(new Date(1996,03,01), "Anton", 1);
        System.out.println(student.getId());
        date.print();
    }
}
