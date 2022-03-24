package dayone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        lists.add(scanner.nextInt());

        for (int i = 0; i<10;i++){
            lists.add(i);
        }
        System.out.println("Iveskite skaiciu");
        lists.add(scanner.nextInt());

        lists.forEach(System.out::println);

    }
}
