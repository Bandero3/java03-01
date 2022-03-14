package daytwo;

import java.util.Arrays;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        TaskThree taskThree = new TaskThree();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite masivo dydi");
        int size = scanner.nextInt();
        int[] mass = taskThree.massCreator(size, scanner);
        System.out.printf("Jusu masyvo skaiciu suma yra: %d\n", taskThree.sumMass(mass));
        System.out.printf("Jusu masyvo skaiciu vidurkis yra: %.1f", taskThree.averageArray(mass));
    }

    private int[] massCreator(int size, Scanner scanner) {
        int[] mass = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Iveskite %d-aji masivo elementa\n", i);
            mass[i] = scanner.nextInt();
        }
        return mass;
    }

    private int sumMass(int[] mass) {
        int sum = 0;
//        for (int i = 0; i < mass.length; i++) {
//            sum += mass[i];
//        }
        for(Integer m : mass){
            sum+=m;
        }
//        int newSum = Arrays.stream(mass).reduce(0, Integer::sum);
        return sum;
    }

    private double averageArray(int[] mass) {
        return (double) (sumMass(mass) / mass.length);
    }
}
