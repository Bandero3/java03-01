package day.two;

import java.util.Scanner;

public class RepeatTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite viena skaiciu \"+\" antra skaiciu");
        String line = scanner.nextLine();
        System.out.println(line);
        Method method = new Method();
        method.calculate(line);
    }
}
