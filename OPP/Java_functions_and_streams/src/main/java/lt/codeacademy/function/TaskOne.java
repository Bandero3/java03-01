package lt.codeacademy.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class TaskOne {
    public static void main(String[] args) {


        BiFunction<List<String>, List<String>, List<String>> bf = (list1,list2) -> {
            List<String> list3 = new ArrayList<>();
//            Collections.sort(list1);
//            Collections.sort(list2);
            list3.addAll(list1);
            list3.addAll(list2);
//            List<String> sortedList = list3.stream().sorted().collect(Collectors.toList());
            Collections.sort(list3);
            return list3;
        };

        List<String> list1 = List.of("Antanas", "Petras", "Gvidas", "Andrius", "Simona");
        List<String> list2 = List.of("Ona","Inga", "Arturas", "Linas", "Povilas");
        System.out.println(bf.apply(list1, list2));
    }
}
