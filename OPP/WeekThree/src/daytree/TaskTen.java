package daytree;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        TaskTen task = new TaskTen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite masivo dydi");
        int size = scanner.nextInt();
        int[] mass = task.massCreator(size, scanner);
        task.printMassDuplicates(mass);
    }

    private int[] massCreator(int size, Scanner scanner) {
        int[] mass = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Iveskite %d-aji masivo elementa\n", i);
            mass[i] = scanner.nextInt();
        }
        return mass;
    }

    private void printMassDuplicates(int [] mass){
        for(int i = 0; i< mass.length; i++){
            for(int j = i+1; j<mass.length; j++){
                if(mass[i] == mass[j]){
                    System.out.printf("Dublikatas: %d\n",mass[i]);
                }
            }
        }
    }
}
