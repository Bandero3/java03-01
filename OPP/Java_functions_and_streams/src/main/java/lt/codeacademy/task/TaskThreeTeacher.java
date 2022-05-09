package lt.codeacademy.task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TaskThreeTeacher {
    public static void main(String[] args) {
        TaskThreeTeacher task = new TaskThreeTeacher();
        List<String> names = List.of();
        try(BufferedReader br = new BufferedReader(new FileReader("people.txt"))){
            names = br.lines()
                    .filter(v -> !v.contains("vardas"))
                    .map(task.getOnlyName())
                    .filter(Objects::nonNull)
                    .distinct()
                    .sorted()
                    .toList();

        } catch (IOException e){
            e.printStackTrace();
        }

        names.forEach(System.out::println);
    }

    private Function<String, String> getOnlyName(){
        return line -> {
            String[] split = line.split(",");
            String name = null;
            if(split.length == 3){
                name = split[1];
            }
            return name;
        };
    }
}
