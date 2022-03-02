package day.three;

import java.time.Year;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite metus");
        int year = scanner.nextInt();
        isLeapYear(year);

        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.isLeapYear(2022));

        boolean isLeap = Year.of(1852).isLeap();
        System.out.println(isLeap);
    }

    private static void isLeapYear(int year) {
        if (year % 4 != 0) {
            System.out.println("Common year");
        } else if (year % 100 != 0) {
            System.out.println("Leap year");
        } else if (year % 400 != 0) {
            System.out.println("Common year");
        } else {
            System.out.println("Leap year");
        }
    }
}
