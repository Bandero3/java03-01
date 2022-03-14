package daytwo;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        TaskFive taskFive = new TaskFive();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite masivo dydi");
        int size = scanner.nextInt();
        int[] mass = taskFive.massCreator(size, scanner);

        System.out.println("Iveskite kelinta elementa norite isimti");
        int removeChar = scanner.nextInt();
        int[] newArray = taskFive.removeMassElement(mass, removeChar);
        for (Integer m : newArray) {
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

    private int[] removeMassElement(int[] mass, int removeChar) {

/*        int [] newArray = new int[mass.length-1];
        int j = 0;
        for(int i = 0; i < mass.length; i++){
            if(i == removeChar){
                i+=1;
            }
            newArray[j] = mass[i];
            j++;
        }
        return newArray;*/

        int j = 0;
        for (int i = 0; i < mass.length; i++) {
            if(i== removeChar){
                i+=1;
            }
            mass[j] = mass[i];
            j++;
        }
        return mass;
    }


}
