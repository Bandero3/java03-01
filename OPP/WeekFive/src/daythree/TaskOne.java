package daythree;

import java.util.HashMap;
import java.util.Map;

public class TaskOne {
    public static void main(String[] args) {
        TaskOne task = new TaskOne();
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(11, "vienuolika");
        numbers.put(12, "dvylika");
        numbers.put(100, "simtas");

        System.out.println(numbers);

        System.out.printf("ar yra key 100 su reiksme simtas: %b\n", numbers.containsKey(100)&&numbers.containsValue("simtas"));
        System.out.printf("rakto 11 reiksme yra: %s\n", numbers.get(11));

        task.printMap(numbers);
        numbers.remove(11);
        task.printMap(numbers);
        numbers.clear();
        task.printMap(numbers);

    }

    private void printMap(Map<Integer, String> map) {
        if (!map.isEmpty()) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                System.out.printf("Raktas: %d, Reiksme: %s\n", entry.getKey(), entry.getValue());
            }
        } else {
            System.out.println("Hashmap tuscias");
        }
    }
}
