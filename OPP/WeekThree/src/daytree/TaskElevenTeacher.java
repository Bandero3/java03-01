package daytree;

import java.util.Scanner;

public class TaskElevenTeacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite kiek skaiciu noresite ivesti");
        int lenght = scanner.nextInt();
        TaskElevenTeacher task = new TaskElevenTeacher();
        int[] mass = task.createAndFillMass(lenght, scanner);

        System.out.println("Iveskite norima suma");
        int sum = scanner.nextInt();
        task.printTwoNumbersSum(mass, sum);
    }

    private int[] createAndFillMass(int lenght, Scanner scanner){
        int[] mass = new int[lenght];

        for(int i = 0; i < mass.length; i++){
            System.out.printf("Iveskite %d skaiciu\n", i);
            mass[i] = scanner.nextInt();
        }
        return mass;
    }

    private void printTwoNumbersSum(int [] mass, int sum){
        for(int i = 0; i < mass.length; i++){
            for(int j = i+1; j < mass.length; j++){
                int tempSum = mass[i] + mass[j];
                if(tempSum == sum){
                    System.out.printf("%d + %d = %d\n", mass[i], mass[j], sum);
                }
            }
        }
    }
}
