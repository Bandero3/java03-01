package dayone;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        //ArrayList

        ArrayList<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        List<String> name3 = List.of();
//        List<String> name3 = List.of("", "", "");

        //LinkedList
        LinkedList<String> cities = new LinkedList<>();
        List<String> cities2 = new LinkedList<>();

        List<String> cars = List.of();

        //add values to collection

        names.add("Andrius");
        names.add("Antanas");
        names2.add("Petras");
        cities.add("Vilnius");
        cities2.add("Kaunas");

        names.set(1, "Jonas"); // pakeicia norimo indexo reiksme nauja
        names.add(0, "Ona"); // ideda i norima indekso vieta


        printList(names);
        printList(names2);
        printList(cities);
        printList(cities2);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);


    }

    private static void printList(List<String> list){
//        list.clear(); isvaloma kolekcija

//        list.sort(((o1, o2) -> o1.compareTo(o2)));
//        list.sort(String::compareTo);
        Collections.sort(list);

        System.out.println(list.isEmpty());

        System.out.printf("Listo el skaicius %s\n", list.size());
        System.out.println(list.contains("Andrius"));

//        list.remove("Antanas"); ne iteracijos metu!!!!!


/*        String value = list.get(0);
        System.out.println(value);*/

/*        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }*/
/*        for(String item: list){
            System.out.println(item);
        }*/

        for(String item : list){
            System.out.println(item);
        }

//        list.forEach(System.out::println);

/*        String name = list.stream()
                .filter(v-> v.equals("Ona")).
                findFirst()
                .orElse(null);*/

        //ciklo metu ismesti reiksme
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String value = iterator.next();
            if(value.equals("Ona")){
                iterator.remove();
            }
            System.out.println(value);
        }
    }
}
