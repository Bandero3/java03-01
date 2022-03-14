package daytree;

import java.util.Arrays;
import java.util.Scanner;

public class TaskEightTeacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite masyvo ilgi");
        int lenght = scanner.nextInt();

        TaskEightTeacher task = new TaskEightTeacher();
        int[] mass = task.createAndFillMass(lenght);
        System.out.println(Arrays.toString(mass));
        task.refillMass(mass);
        System.out.println(Arrays.toString(mass));
        task.printMass(mass);
    }

    private int[] createAndFillMass(int lenght) {
        int[] mass = new int[lenght];
        for (int i = mass.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                mass[i] = i;
            } else {
                mass[i] = -i;
            }
        }
        return mass;
    }

    private void refillMass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (i % 3 == 0) {
                mass[i] *= 2;
            }
        }
    }

    private void printMass(int[] mass) {
        for (int i = mass.length - 1; i >= 0; i -= 2) {
            int j = i-1 < 0 ? 0 : i-1; // tikrina ar i yra maziau 0
            System.out.printf("%d %d\n", mass[i], mass[j]);
        }
    }
}
