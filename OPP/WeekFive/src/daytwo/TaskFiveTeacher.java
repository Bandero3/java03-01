package daytwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskFiveTeacher {
    public static void main(String[] args) {
        TaskFiveTeacher task = new TaskFiveTeacher();
        Scanner scanner = new Scanner(System.in);
        String action;

        List<String> words = new ArrayList<>();
        do{
            task.showMenu();
            action = scanner.nextLine();
            task.callAction(scanner,action, words);
        }while(!action.equals("6"));

    }

    private void showMenu(){
        System.out.println("""
                1. Ivesti zodi
                2. Rasti zodi
                3. Trinti zodi
                4. Isvalyti sarasa
                5. Atspausdinti sarasa
                6. Baigti
                """);
    }
    private void callAction(Scanner scanner, String action, List <String> words){
        switch(action){
            case "1" -> addWord(scanner, words);
            case "2" -> findWord(scanner, words);
            case "3" -> deleteWord(scanner, words);
            case "4" -> clearWords(words);
            case "5" -> System.out.println(words);
            case "6" -> System.out.println("Programa baige darba");
            default -> System.out.println("Tokio actiono nera");
        }
    }

    private void clearWords(List<String> words) {
        words.clear();
        System.out.println("Sarasas isvalytas");
    }

    private void deleteWord(Scanner scanner, List<String> words) {
        System.out.println("Iveskite norima istrinti zodi:");
        String word = scanner.nextLine();

        if(!words.contains(word)){
            System.out.printf("%s tokio zodzio sarase nera\n", word);
        }
        words.remove(word);
    }

    private void findWord(Scanner scanner, List<String> words) {
        System.out.println("Iveskite ieskoma zodi:");
        String word = scanner.nextLine();
        if(!words.contains(word)){
            System.out.printf("%s zodzio nera\n", word);
            return;
        }

        System.out.printf("%s zodzio indexas yra %d\n", word, words.indexOf(word));
    }

    private void addWord(Scanner scanner, List<String> words) {
        System.out.println("Iveskite norima zodi:");
        words.add(scanner.nextLine());
    }

}
