package daythree;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Irasykite teksta");

        StringBuilder text = new StringBuilder(scanner.nextLine());
        String compareString = text.toString().toLowerCase();


        if(compareString.equals(text.reverse().toString().toLowerCase())){
            System.out.println("Polindromas");
        } else {
            System.out.println("Nepolindromas");
        }
    }
}
