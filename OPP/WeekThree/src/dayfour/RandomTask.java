package dayfour;

import java.util.Random;
import java.util.Scanner;

public class RandomTask {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite intervalo min reiksme");
        int min = scanner.nextInt();

        System.out.println("Iveskite intervalo max reiksme");
        int max;
        do{
            System.out.printf("Jusu skaicius negali buti mazesnis uz minimuma: %d\n",min );
            max = scanner.nextInt();
        }while(max<min);

        System.out.printf("Jusu sugeneruotas skaicius tarp %d ir %d yra: %d",min,max, random.nextInt(min,max)+1);
    }
}
