package lt.codeacademy.generic;

import java.util.Arrays;
import java.util.List;

public class TaskOne {
    public static void main(String[] args) {
        TaskOne task = new TaskOne();
        List<Integer> numbers = List.of(1, 2, 3);
        List<String> words = List.of("Hello", "world");

        task.printList(numbers);
        task.printList(words);

        Integer[] numberMas = {1, 2, 3};
        String[] wordMas = {"Hello", "world"};

        task.printMas(numberMas);
        task.printMas(wordMas);
    }

    private void printList(List<?> list) {
        list.forEach(System.out::println);
    }

    private <T> void printMas(T[] mass) {
        Arrays.stream(mass).forEach(System.out::println);
    }
}
