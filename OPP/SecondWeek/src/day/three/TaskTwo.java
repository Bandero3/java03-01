package day.three;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite menesio skaičiu");
        int monthNumb = scanner.nextInt();

        if (monthNumb > 0 && monthNumb < 13) {
            if (monthNumb % 2 == 0) {
                checkMonthEven(monthNumb);
            } else {
                checkMonthOdd(monthNumb);
            }
        } else {
            System.out.println("Blogas skaičius");
        }
    }

    private static void checkMonthEven(int monthNumb) {
        switch (monthNumb) {
            case 2 -> System.out.println("VASARIS");
            case 4 -> System.out.println("BALANDIS");
            case 6 -> System.out.println("BIRŽELIS");
            case 8 -> System.out.println("RUGPJŪTIS");
            case 10 -> System.out.println("SPALIS");
            case 12 -> System.out.println("GRUODIS");
        }
    }

    private static void checkMonthOdd(int monthNumb) {
        switch (monthNumb) {
            case 1 -> System.out.println("sausis");
            case 3 -> System.out.println("kovas");
            case 5 -> System.out.println("gegužė");
            case 7 -> System.out.println("liepa");
            case 9 -> System.out.println("rugsėjis");
            case 11 -> System.out.println("lapkritis");
        }
    }
}
