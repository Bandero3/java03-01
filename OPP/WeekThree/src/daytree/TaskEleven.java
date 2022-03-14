package daytree;

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        TaskEleven task = new TaskEleven();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite masivo dydi");
        int size = scanner.nextInt();
        int[] mass = task.massCreator(size, scanner);
        System.out.println("Iveskite masyvo poros suma kuria norite ieskoti");
        int sum = scanner.nextInt();
        task.printSumPairs(mass,sum);
    }

    private int[] massCreator(int size, Scanner scanner) {
        int[] mass = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Iveskite %d-aji masivo elementa\n", i);
            mass[i] = scanner.nextInt();
        }
        return mass;
    }

    private void printSumPairs(int [] mass, int sum){
        for(int i = 0; i < mass.length; i++){
            for(int j = i+1; j < mass.length; j++){
                if(mass[i]+mass[j] == sum){
                    System.out.printf("%d + %d = %d\n", mass[i], mass[j], sum);
                }
            }
        }
    }
}
