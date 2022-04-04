package daytwo;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Andrius", "Pavarde", "33333338", "KTU");
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getPersonCode());
        testMethod(student);

        Person person = new Person("Andrius","Pavarde1", "33333338");
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getPersonCode());

        System.out.println(student.printInfo());
        System.out.println(person.printInfo());
        testMethod(person);

        Person person1 =new Student("Andrius2", "Pavarde2", "22222", "KTU2");
        System.out.println(person1.printInfo());

        if(person1 instanceof Student){
            Student st = (Student) person1;
            System.out.println(st.getUniversity());
        }

        if(person1 instanceof Student st){ //New pattern
            System.out.println(st.getUniversity());
        }
    }

    private static void testMethod(Person person){
        System.out.println("is metodo" + person.printInfo());
    }
}
