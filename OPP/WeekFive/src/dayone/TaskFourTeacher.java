package dayone;

import java.util.ArrayList;
import java.util.List;

public class TaskFourTeacher {
    public static void main(String[] args) {
        List<String> texts = new ArrayList<>();
        texts.add("vienas");
        texts.add("du");
        texts.add("vienas");
        texts.add("tris");
        texts.add("keturi");
        texts.add("du");
        System.out.println(texts);

        TaskFourTeacher task = new TaskFourTeacher();
        System.out.println(task.removeDuplicates(texts));

        //nuo java 8
/*        List<String> strings = texts.stream().distinct().toList();
        System.out.println(strings);*/

    }

    private List<String> removeDuplicates(List<String> list){
        List<String> newList = new ArrayList<>();

        for(String t: list){
            if(!newList.contains(t)){
                newList.add(t);
            }
        }
        return newList;

    }
}
