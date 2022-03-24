package daythree;

import java.util.HashMap;
import java.util.Map;

public class TaskOneTeacher {
    public static void main(String[] args) {
        Map<Integer, String> values = new HashMap<>();
        values.put(11, "vienuolika");
        values.put(12, "dvylika");
        values.put(100, "simtas");

        System.out.println(values);
        if(values.containsKey(11) && values.containsValue("vienuolika")){
            System.out.println("Yra tokia pora");
        }

        System.out.println(values.get(100));

        TaskOneTeacher task = new TaskOneTeacher();
        task.printMap(values);
        values.remove(11);
        task.printMap(values);
        values.clear();
        task.printMap(values);

    }

    private void printMap(Map<Integer,String> values){
        for(Integer key: values.keySet()){
            System.out.printf("Raktas: %s, Reiksmes: %s\n", key, values.get(key));
        }
    }
}
