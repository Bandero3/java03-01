package dayfour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite varda");
        String name = scanner.nextLine();
        System.out.println("Iveskite pavarde");
        String surname = scanner.nextLine();
        System.out.println("Iveskite amziu");
        int age = scanner.nextInt();
        System.out.printf("%s %s %d metu",name,surname,age);
    }
}
