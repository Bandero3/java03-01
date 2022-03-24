package daythree;

import java.util.HashMap;
import java.util.Map;

public class TaskThreeTeacher {
    public static void main(String[] args) {
        Map<Integer,String> values = new HashMap<>();
        values.put(11, "vienuoolika");
        values.put(12, "dvylika");
        values.put(100, "simtas");

        Map<String, Integer> newValues = new HashMap<>();

        for(Map.Entry<Integer,String> entry: values.entrySet()){
            newValues.put(entry.getValue(), entry.getKey());
        }
        TaskThreeTeacher task = new TaskThreeTeacher();
        task.printMap(newValues);
//        task.printMap(values);

    }

    private void printMap(Map<String, Integer> values){
        for(String key: values.keySet()){
            System.out.printf("Raktas: %s, Reiksmes: %s\n", key, values.get(key));
        }
    }

    //generic map
/*    private <K,V> void printMap(Map<K, V> values){
        for(K key: values.keySet()){
            System.out.printf("Raktas: %s, Reiksmes: %s\n", key, values.get(key));
        }
    }*/
}
