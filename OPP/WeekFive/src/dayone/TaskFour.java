package dayone;

import java.util.*;

public class TaskFour {
    public static void main(String[] args) {
        List<String> texts = new ArrayList<>();
        texts.add("vienas");
        texts.add("du");
        texts.add("vienas");
        texts.add("tris");
        texts.add("keturi");
        texts.add("du");

        Collections.sort(texts);

        texts.forEach(System.out::println);
        System.out.println("*****************");

        Iterator<String> iterator = texts.iterator();
        while(iterator.hasNext()){
            String value = iterator.next();
            if(value.equals(iterator.next())){
                iterator.remove();
            }
            System.out.println(value);
        }
    }
}
