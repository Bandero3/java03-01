package dayone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskThree {
    public static void main(String[] args) {
        List<String> lists = List.of("Petras", "Antanas", "Gintas", "Jonas", "Kazimeras");

        List<Integer> numbers = new ArrayList<>();

        for(String item: lists){
            numbers.add(item.toString().length());
        }
        int max = Collections.max(numbers);
        System.out.println(lists.get(numbers.indexOf(max)));
    }
}
