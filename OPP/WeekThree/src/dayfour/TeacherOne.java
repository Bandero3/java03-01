package dayfour;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TeacherOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite kiek norite sugeneruoti skaiciu");
        int lenght = scanner.nextInt(); //50

        TeacherOne task = new TeacherOne();
        int [] mass = task.createAndFillMass(lenght);
        System.out.println(Arrays.toString(mass));
        System.out.printf("MAX value: %d\n", task.findMax(mass));


    }

    private int [] createAndFillMass(int numb){
        Random random = new Random();
        int [] mass = new int[numb];

        for(int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(100)+1;
        }
        return mass;
    }

    private int findMax(int [] mass){
        int max = mass[0];
        for(int i = 1; i < mass.length; i++){
            if(mass[i] > max){
                max = mass[i];
            }
        }
        return max;
    }
}
