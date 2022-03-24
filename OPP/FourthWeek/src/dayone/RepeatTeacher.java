package dayone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RepeatTeacher {
    private static double amount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RepeatTeacher task = new RepeatTeacher();
        System.out.println("Iveskite saskaitos balansa");
        amount = task.getCorrectDouble(scanner);
        task.checkoutMoney(scanner);

    }

    private void checkoutMoney(Scanner scanner) {
        int counter = 0;
        do {
            System.out.printf("Saskaitos likutis yra: %.2f eur\n", amount);
            double sum = getCorrectDouble(scanner);
            if (sum > amount) {
                ++counter;
                System.out.println("Suma per didele");
                continue;
            }

            counter = 0;
            amount -= sum;
        } while (amount > 0 && counter != 3);
    }

    private double getCorrectDouble(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivesta reiksme pakartokite");
                scanner.nextLine();
            }

        }

    }
}
