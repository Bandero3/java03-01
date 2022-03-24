package daythree;

import daytwo.Person;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Andrius");
        names.put(3, "Petras");
        names.put(5, "Jonas");
        names.put(2, "Andrius");
        names.put(3, "Ona");

        System.out.println(names.get(3));
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.values());
        System.out.println(names.containsKey(5));


        Map<Integer, String> cars = new LinkedHashMap<>();
        cars.put(2, "bmw");
        cars.put(5, "audi");
        cars.put(6, "vw");
        cars.put(7, "opel");
        cars.put(1, "toyota");
        System.out.println(cars);


        Map<Integer, String> cities = new TreeMap<>();
        cities.put(5, "Alytus");
        cities.put(2, "Panevezys");
        cities.put(15, "Kaunas");
        cities.put(10, "Vilnius");
        System.out.println(cities);

        Map<String, String> names2 = Map.of("k1", "v1", "k2", "v2");

        System.out.println(names.get("k2"));

        for (String key : names2.keySet()) {
            System.out.printf("%s-%s\n", key, names2.get(key));
        }

        for (String value : names2.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> entry : names2.entrySet()) {
            System.out.printf("%s-%s\n", entry.getKey(), entry.getValue());
        }
//        names2.entrySet().forEach(entry-> System.out.printf("%s-%s-\n",entry.getKey(),entry.getValue()));
        Map<String, Person> persons = new HashMap<>();
        persons.put("Andrius", new Person("Andrius", 82));
        persons.put("Petras", new Person("Andrius", 82));
        persons.put("Jonas", new Person("Andrius", 82));
        persons.put("Antanas", new Person("Andrius", 82));
        persons.put("Jokubas", new Person("Andrius", 82));

        Map<Person, Integer> persons2 = new HashMap<>();
        persons2.put(new Person("Andrius", 82), 5);
        persons2.put(new Person("Andrius", 82), 10);
        persons2.put(new Person("Jonas", 10), 50);
        persons2.put(new Person("Andrius", 82), 50);
        persons2.put(new Person("Andrius", 82), 55);
        System.out.println(persons2);

        //?
        Set<Map.Entry<Person, Integer>> entries = persons2.entrySet();
        Iterator<Map.Entry<Person, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, Integer> entry = iterator.next();
            System.out.printf("%s-%s\n", entry.getKey(), entry.getValue());
        }

    }

}

