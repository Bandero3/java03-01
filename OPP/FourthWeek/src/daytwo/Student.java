package daytwo;

import java.util.Objects;

public class Student {
    private final int id;
    private final int age;
    private String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printInfo(){
        System.out.printf("Vardas: %s Amzius: %d ID: %d\n",name,age,id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class StudentMain{
    public static void main(String[] args) {
        Student studentOne = new Student(001, 22, "Andrius");
        Student studentTwo = new Student(002, 25, "Povilas");
        Student studentThree = new Student(003, 28, "Simona");

        studentOne.setName("Petras");

        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println(studentThree);

        System.out.println(studentOne.getAge());
        studentOne.printInfo();
    }
}
