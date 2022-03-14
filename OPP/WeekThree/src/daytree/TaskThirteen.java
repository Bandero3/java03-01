package daytree;

import java.util.Scanner;

public class TaskThirteen {
    public static void main(String[] args) {
        TaskThirteen task = new TaskThirteen();
        Scanner scanner = new Scanner(System.in);
        task.calculateBMI(task.GetMassAndHeight(scanner));
    }

    private double[] GetMassAndHeight(Scanner scanner) {
        double[] stats = new double[2];
        System.out.println("Iveskite savo mase:");
        stats[0] = scanner.nextDouble();
        System.out.println("Iveskite savo ugi:");
        stats[1] = scanner.nextDouble();
        return stats;
    }

    private void calculateBMI(double[] mass) {
        System.out.printf("KMI = %.2f (kg) / (%.2f (m))^2 = %.2f", mass[0], mass[1], mass[0] / (Math.pow(mass[1], 2)));
    }
}
