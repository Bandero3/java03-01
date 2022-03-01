public class Person {
    String name;
    int age;
    int weight;

    public Person(String name){
        this(name,10,10);
//        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
    }

    public void printValues(){
        System.out.printf("name: %s, age: %s\n", name, age);
    }
}
