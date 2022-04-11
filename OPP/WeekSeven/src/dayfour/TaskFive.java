package dayfour;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskFive {
    static int counter = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskFive task = new TaskFive();
        double [] mass = new double[10];
        while(true){
            try{
                System.out.println("Iveskite sveikaji skaiciu");
                mass[counter] = scanner.nextInt();
                counter++;
            } catch (InputMismatchException e){
                System.out.println(task.average(mass));
                break;
            }
        }

    }


    public double average(double mass[]){
        double sum = 0;
        double lenght = 0;
        for(int i = 0; i<mass.length; i++){
            if(mass[i] == 0){
                continue;
            }
            sum+=mass[i];
            lenght++;
        }
        return sum/lenght;
    }
}
