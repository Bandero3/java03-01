package daytwo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        SetExample task = new SetExample();
        task.hashSetExample();
        task.linkedHashSetExample();
        task.treeSetExample();

    }

    private void hashSetExample(){
        /*Set<String> names = new HashSet<>();
        names.add("Petras");
        names.add("Jonas");
        names.add("Antanas");
        names.add("Jokubas");

        names.add("Antanas");

        System.out.println(names.size());
        System.out.println(names);*/

        Set<Person> persons = new HashSet<>();
        persons.add(new Person("Andrius", 15));
        persons.add(new Person("Petras", 15));
        persons.add(new Person("Andrius", 30));
        persons.add(new Person("Andrius", 15));

        System.out.println(persons);
    }

    private void linkedHashSetExample(){
        Set<String> names = new LinkedHashSet<>();
        names.add("Vienas");
        names.add("Du");
        names.add("Tris");
        names.add("Keturi");
        names.add("Penki");
        names.add("Vienas");

        System.out.println(names);
    }

    private void treeSetExample(){
/*        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);


        System.out.println(numbers);*/
        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Andrius", 15));
        persons.add(new Person("Petras", 15));
        persons.add(new Person("Andrius", 30));
        persons.add(new Person("Andrius", 15));

        System.out.println(persons);

        Set<Set<Person>> v = new HashSet<>();
    }
}
