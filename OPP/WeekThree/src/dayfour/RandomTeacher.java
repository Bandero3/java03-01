package dayfour;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomTeacher {
    public static void main(String[] args) {
        RandomTeacher task = new RandomTeacher();
        System.out.printf("Sugeneruotas skaicius %d ", task.rangeRandomNumber());

    }

    private int rangeRandomNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = getCorrectNumber(scanner, "Iveskite min rezi");
        int max = getBiggerNumber(scanner, min);

        return random.nextInt(min, max + 1);
    }

    private int getBiggerNumber(Scanner scanner, int minNumb) {
        int max;
        do {
            max = getCorrectNumber(scanner, "Iveskite max rezi");
            if (max < minNumb || max == minNumb) {
                System.out.printf("Ivestas %d skaicius per mazas\n", max);
            }
        } while (max < minNumb || max == minNumb);
        return max;
    }


    private int getCorrectNumber(Scanner scanner, String text) {
        while (true) {
            try {
                System.out.println(text);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ivedete ne skaiciu");
                scanner.nextLine();
            }

        }

    }
}
