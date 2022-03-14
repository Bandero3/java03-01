package daytwo;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        TaskSix taskSix = new TaskSix();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite masivo dydi");
        int size = scanner.nextInt();
        int [] mass = taskSix.massCreator(size, scanner);
        taskSix.copyArray(mass);


    }

    private int [] massCreator(int size, Scanner scanner){
        int [] mass = new int[size];
        for(int i = 0; i< size; i++){
            System.out.printf("Iveskite %d-aji masivo elementa\n",i);
            mass[i] = scanner.nextInt();
        }
        return mass;
    }

    private int [] copyArray(int [] mass){
        int array[] = new int[mass.length];
        for(int i = 0; i< mass.length; i++){
            array[i]=mass[i];
        }
        return array;
    }
}
