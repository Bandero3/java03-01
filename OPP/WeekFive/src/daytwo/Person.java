package daytwo;


import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person o) {
/*        if(name.equals(o.getName())){
            if(age == o.getAge()){
                return 0;
            }
            return age> o.getAge() ? 1 : -1;
        }
        return name.compareTo(o.getName());*/

        int comp = name.compareTo(o.getName());
        if(comp == 0){
            if(age == o.getAge()){
                return 0;
            }
            return age> o.getAge() ? 1 : -1;
        }
        return comp;
        }
}
