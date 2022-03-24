package dayone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String text;
        do{
            System.out.println("Iveskite nauja elementa");
            if(lists.size() == 5){
                lists.clear();
            }
            text = scanner.nextLine();
            if(lists.contains(text)){
                System.out.println("Toks elementas jau yra, irasykite kita");
                continue;
            }
            if(!text.equals("exit")){
                lists.add(text);
            }
            lists.forEach(System.out::println);
        }while(!text.equals("exit"));
    }
}
