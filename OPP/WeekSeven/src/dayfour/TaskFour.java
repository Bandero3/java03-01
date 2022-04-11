package dayfour;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite pirma zodi");
        String a = scanner.nextLine();
        System.out.println("Iveskite antra zodi");
        String b = scanner.nextLine();
        TaskFour task = new TaskFour();
        task.mixString(a, b);
    }

    private void mixString(String text1, String text2) {

        StringBuilder textA = new StringBuilder(text1);
        StringBuilder textB = new StringBuilder(text2);
        StringBuilder newText = new StringBuilder();

        int lenght = text1.length() < text2.length() ? text1.length() : text2.length();

        for (int i = 0; i < lenght; i++) {
            newText.append(text1.charAt(i)).append(text2.charAt(i));
            textA.deleteCharAt(0);
            textB.deleteCharAt(0);
        }
        if (textA.isEmpty()) {
            newText.append(textB);
        } else {
            newText.append(textA);
        }
        System.out.println(newText.toString());

    }
}
