package day.one;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite savo varda pavarde");
//        String name = scanner.nextLine();
/*        String name = scanner.next();
        String surnamename = scanner.next();

        System.out.println(name);
        System.out.println(surnamename);*/

        int number = scanner.nextInt();
        System.out.println(number);
    }

}
