public class ConstructorExample {
    String name;
    int age;

    public static void main(String[] args) {
        Person person1 = new Person("Anton", 25);
        person1.printValues();

        Person person2 = new Person("Peter");
        person2.printValues();
    }
}
