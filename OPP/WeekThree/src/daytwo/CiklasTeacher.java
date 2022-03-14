package daytwo;

import java.util.Scanner;

public class CiklasTeacher {
    public static void main(String[] args) {
        CiklasTeacher ciklasTeacher = new CiklasTeacher();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite palindroma");
        String line = scanner.nextLine().replaceAll(" ", "");

        System.out.printf("Ivestas tekstas \"%s\" polidrome= %s",line, ciklasTeacher.isPalindrome(line));
    }

    private boolean isPalindrome(String line) {
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != line.charAt(line.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
