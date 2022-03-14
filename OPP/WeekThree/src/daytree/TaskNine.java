package daytree;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        TaskNine task = new TaskNine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite masivo dydi");
        int size = scanner.nextInt();
        int[] mass = task.massCreator(size, scanner);
        task.printMass(mass);
        System.out.println("-------------");
        task.printMass(task.reverseMass(mass));

    }

    private void printMass(int[] mass) {
        for (Integer m : mass) {
            System.out.println(m);
        }
    }

    private int[] massCreator(int size, Scanner scanner) {
        int[] mass = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Iveskite %d-aji masivo elementa\n", i);
            mass[i] = scanner.nextInt();
        }
        return mass;
    }

    private int[] reverseMass(int[] mass) {
        int[] newMass = new int[mass.length];
        int j = 0;
        for (int i = mass.length - 1; i <= 0; i--) {
            newMass[j++] = mass[i];
        }
        return newMass;
    }
}
