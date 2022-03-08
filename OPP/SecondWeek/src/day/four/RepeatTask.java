package day.four;

import java.util.Locale;
import java.util.Scanner;

public class RepeatTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite teksta");
        String line = scanner.nextLine();
        System.out.println("Iveskite ieskoma zodi");
        String word = scanner.nextLine();

        RepeatTask repeatTask = new RepeatTask();
        repeatTask.findAndPrintWord(line, word);
    }

    private void findAndPrintWord(String line, String word){
        if(line.toLowerCase().contains(word)){
            System.out.printf("%s zodis yra tekste\n", word);
        } else{
            System.out.printf("%s zodzio nera tekste\n", word);

        }
    }
}
