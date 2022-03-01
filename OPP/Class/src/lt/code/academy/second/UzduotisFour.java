package lt.code.academy.second;

import java.util.Scanner;

public class UzduotisFour {
    public static void main(String[] args) {

        Calculations uzduotisFour = new Calculations();

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        do {
            System.out.println("Iveskite teigiama a skaičiu");
            while (!scanner.hasNextInt()) {
                System.out.println("Čia ne skaičius");
                scanner.next();
            }
            a = scanner.nextInt();

        } while (a <= 0);
        System.out.println("Skaičius a: " + a);

        do {
            System.out.println("Iveskite teigiama b skaičiu");
            while (!scanner.hasNextInt()) {
                System.out.println("Čia ne skaičius");
                scanner.next();
            }
            b = scanner.nextInt();

        } while (b <= 0);
        System.out.println("Skaičius b: " + b);


        boolean done = false;

        while (!done) {
            System.out.println("Pasirinkite koki plota norite apskaičiuoti: 1 Trikampio | 2 Stačiakampio | 3 Kvadrato | 4 Apskritimo | 5 Uždaryti applikacija");

            while (!scanner.hasNextInt()) {
                System.out.println("Čia ne skaičius");
                scanner.next();
            }
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    uzduotisFour.triangleArea(a, b);
                    break;
                case 2:
                    uzduotisFour.rectangleArea(a, b);
                    break;
                case 3:
                    uzduotisFour.squareArea(a);
                    break;
                case 4:
                    uzduotisFour.circleArea(a);
                    break;
                case 5:
                    done = true;
                    break;
                default:
                    System.out.println("Iveskite skaičiu nuo 1 iki 5");
            }
        }


//        Calculations uzduotisFour = new Calculations();
//
//
//        uzduotisFour.triangleArea(5, 6);
//        uzduotisFour.rectangleArea(5, 6);
//        uzduotisFour.squareArea(5);
//        uzduotisFour.circleArea(5);
    }

//    public void triangleArea(double a, double b){
//        System.out.println("Trikampio plotas: " + (a*b)/2);
//    }
//    public void rectangleArea(double a, double b){
//        System.out.println("Staciakampio plotas: " + a*b);
//    }
//    public void squareArea(double a){
//        System.out.println("Kvadrato plotas: " + a*a);
//    }
//    public void circleArea(double a){
//        System.out.println("Apskritimo plotas: " + 3.1415*(a*a));
//    }
}
