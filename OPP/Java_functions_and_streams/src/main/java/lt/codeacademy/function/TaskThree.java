package lt.codeacademy.function;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskThree {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("people.txt"))){
            List<String> names = new ArrayList<>();
            String line;
            while((line = br.readLine()) != null){
                if(line.startsWith("id")){
                    continue;
                }
                String[] split = line.split(",");
                names.add(split[1]);
            }
            List<String> sortedNames = names.stream().distinct().sorted().toList();
            sortedNames.forEach(System.out::println);

/*            Stream<String> stream;
            stream = br.lines();
            stream.forEach(System.out::println);*/

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
