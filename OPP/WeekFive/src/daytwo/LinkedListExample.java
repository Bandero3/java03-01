package daytwo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("test");

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.addFirst(15);
        numbers.addLast(10);
        numbers.add(5);

        System.out.println(numbers);

/*        Integer poll = numbers.poll(); // jei elemento nera grazina null, istrina pirma elementa
        System.out.println(poll);
        System.out.println(numbers);*/

/*        Integer pop = numbers.pop(); // jej nera elemento exceptionas
        System.out.println(pop);
        System.out.println(numbers);*/

        numbers.push(4);
        System.out.println(numbers);


        numbers.getFirst(); // grazina pirma elementa neistrinant jo is kelekcijos, jej nera meta exceptiona
        numbers.getLast(); // grazina paskutini elementa neistrinant jo is kelekcijos, jej nera meta exceptiona
    }
}
