package lt.codeacademy.function;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskOneTeacher {
    public static void main(String[] args) {
        List<String> first = List.of("Petras", "Jonas", "Antanas");
        List<String> second = List.of("Ona", "Kazys", "Andrius");

        BiFunction<List<String>, List<String>, List<String>> sortFunction = (list, list2) -> {
            List<String> names = new ArrayList<>(list);
            names.addAll(list2);
            Collections.sort(names);

            return names;
        };
        System.out.println(sortFunction.apply(first, second));

        BiFunction<List<String>, List<String>, List<String>> sortFunction2 = (list, list2) ->
                Stream.concat(list.stream(), list2.stream()).sorted().collect(Collectors.toList());

        System.out.println(sortFunction2.apply(first,second));


        BiFunction<List<String>, List<String>, List<String>> sortFunction3 = (list, list2)
                -> List.of(list, list2).stream().flatMap(Collection::stream).sorted().collect(Collectors.toList());

        System.out.println(sortFunction3.apply(first,second));
    }



}
