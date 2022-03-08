package day.four;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite masivo ilgi");
        int mass = scanner.nextInt();
        if(mass > 7){
            int [] a = new int[8];
            a[0] = mass;
            a[7] = mass;
            System.out.printf("pirmas: %s | paskutinis: %s",a[0], a[7]);
            return;
        }
        int [] a = new int[mass];
        a[0]=mass;
        a[mass-1]=mass;
        System.out.printf("ilgis : %s | ivestas ilgis: %s\n", a.length,mass);

        System.out.printf("pirmas: %s | paskutinis: %s",a[0], a[mass-1]);
    }
}
