package daythree;

import java.util.Scanner;

public class TaskTwoTeacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite polindroma");
        String text = scanner.nextLine().toLowerCase();
        TaskTwoTeacher task = new TaskTwoTeacher();
        if(task.isPalindrome(text)){
            System.out.println("Yra plondromas");
        } else {
            System.out.println("Nera polindromas");
        }

    }

    private boolean isPalindrome(String text){
        StringBuilder sb = new StringBuilder(text);
        String reversed = sb.reverse().toString();

        return reversed.equals(text);
    }
}
