package daytree;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFiveTeacher {
    public static void main(String[] args) {
        int[] mass = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(mass));
        System.out.println("Iveskite skaiciu kuri norite ismesti");
        int numb = scanner.nextInt();
    }
    private void removeNumberFromArray(int [] mass, int numb){
        int index = 0;
        for(int i =0; i< mass.length; i++){
            if(mass[i] == numb){
                ++i;
            }
            mass[index++]=mass[i];
        }
    }
}
