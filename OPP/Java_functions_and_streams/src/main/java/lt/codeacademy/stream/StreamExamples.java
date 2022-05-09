package lt.codeacademy.stream;


import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExamples {
    public static void main(String[] args) {
        List<String> names = List.of("Petras", "Jonas", "Antanas", "Ona", "Kazys");


        //.map
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
//        List<String> upperCaseNames = names.stream().map(String::toUpperCase).toList();
//        names.stream().map(v -> v.toUpperCase()).collect(Collectors.toList());

        upperCaseNames.forEach(System.out::println);

//        upperCaseNames.forEach(v -> System.out.println(v));

        List<String> stringNumbers = List.of("4", "54", "2");
        List<Integer> integers = stringNumbers.stream().map(Integer::valueOf).toList();
//        stringNumbers.stream().map(v -> Integer.valueOf(v)).toList();


        //.filter
        List<String> fileredNames = names.stream().filter(v -> v.length() >= 6).map((String::toLowerCase)).sorted().toList();

        fileredNames.forEach(System.out::println);

        StreamExamples example = new StreamExamples();

        String firstName = names.stream().filter(example.checkName()).findFirst().map(String::toUpperCase).orElse(null);
        System.out.println(firstName);

        //flatmap
        List<List<Integer>> numbersOfNumbers = List.of(List.of(5, 8, 6, 5), List.of(9, 8, 5, 4), List.of(55, 8, 9, 5, 22));
        List<Integer> filteredNumbers = numbersOfNumbers.stream().flatMap(Collection::stream).filter(v -> v > 5).toList();

        System.out.println(filteredNumbers);

        //reduce
        Optional<String> reduce = names.stream().reduce((v, v2) -> v + " & " + v2);


/*        if(reduce.isPresent()){
            System.out.println(reduce.get());
        }*/

        reduce.ifPresent(System.out::println);

        Integer result = integers.stream().reduce(0, (v, v2) -> v + v2);
        Integer result2 = integers.stream().reduce(40, Integer::sum);
        System.out.println(result);
        System.out.println(result2);

        //Min\Max

        System.out.println("Max " + integers.stream().max(Integer::compareTo).orElse(0));
        System.out.println("Min " + integers.stream().min(Integer::compareTo).orElse(0));

    }

    private Predicate<String> checkName() {
        return v -> v.length() >= 6;
    }
}
