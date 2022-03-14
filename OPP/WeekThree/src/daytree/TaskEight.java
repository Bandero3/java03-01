package daytree;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        TaskEight taskEight = new TaskEight();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite masyvo dydi");
        int size = scanner.nextInt();
        int[] mass = taskEight.populateMass(size);
        taskEight.printMass(mass);

        System.out.println("------------------------");
        int[] newMass = taskEight.updateMass(mass);
        taskEight.printMass(newMass);
    }

    private void printMass(int[] mass) {
        for (Integer m : mass) {
            System.out.println(m);
        }
    }

    private int[] populateMass(int size) {
        int[] mass = new int[size];
        for (int i = mass.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                mass[i] = i;
            } else {
                mass[i] = i * -1;
            }
        }
        return mass;
    }

    private int[] updateMass(int[] mass) {
        for (int i = mass.length - 1; i >= 0; i -= 2) {
            if (i % 3 == 0) {
                mass[i] = mass[i] * 2;
            } else {
                mass[i] = mass[i];
            }
        }
        return mass;
    }

    /*
    private int[] updateMass(int[] mass) {
        for (int i = 3; i < mass.length; i += 3) {
            mass[i] = mass[i] * 2;
        }
        return mass;
    }*/
}
