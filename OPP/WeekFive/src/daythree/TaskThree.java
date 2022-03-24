package daythree;

import java.util.HashMap;
import java.util.Map;

public class TaskThree {
    public static void main(String[] args) {
        TaskThree task = new TaskThree();
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(11, "vienuolika");
        numbers.put(12, "dvylika");
        numbers.put(100, "simtas");

        Map<String, Integer> numbers2 = new HashMap<>();

        for (Integer key: numbers.keySet()) {
            numbers2.put(numbers.get(key), key);
        }

        task.printMap(numbers);
        task.printMap(numbers2);
        task.printKey(numbers);
        task.printKey(numbers2);

    }


    private void printMap(Map<?, ?> map) {
        if (!map.isEmpty()) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                System.out.printf("Raktas: %s, Reiksme: %s\n", entry.getKey(), entry.getValue());
            }
        } else {
            System.out.println("Hashmap tuscias");
        }
    }

    private void printKey(Map<?, ?> map) {
        if (!map.isEmpty()) {
            for (Object key : map.keySet()) {
                System.out.printf("Raktas: %s\n", key);
            }
        } else {
            System.out.println("Hashmap tuscias");
        }
    }
}
