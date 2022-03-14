package daytree;

import java.util.Scanner;

public class TaskTwelve {
    static final double PI = 3.1415;
    public static void main(String[] args) {
        TaskTwelve task = new TaskTwelve();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Parasykite kokios figuros plota norite skaiciuoti: trikampio, staciakampio, kvadrato, apskritimo");
        String figure = scanner.nextLine();

        switch(figure){
            case "trikampio" -> task.trikampis(scanner);
            case "staciakampio" -> task.staciakampis(scanner);
            case "kvadrato" -> task.kvadratas(scanner);
            case "apskritimo" -> task.apskritimas(scanner);
            default -> System.out.println("Nesamone");
        }
    }
    private void trikampis(Scanner scanner){
        System.out.println("Iveskite a verte:");
        int a = scanner.nextInt();
        System.out.println("Iveskite b verte:");
        int b = scanner.nextInt();
        System.out.printf("(%d*%d)/2=%d",a,b,(a*b)/2);
    }
    private void staciakampis(Scanner scanner){
        System.out.println("Iveskite a verte:");
        int a = scanner.nextInt();
        System.out.println("Iveskite b verte:");
        int b = scanner.nextInt();
        System.out.printf("%d*%d=%d",a,b,(a*b));
    }
    private void kvadratas(Scanner scanner){
        System.out.println("Iveskite a verte:");
        int a = scanner.nextInt();
        System.out.printf("%d^2=%d",a,Math.pow(a,2));
    }
    private void apskritimas(Scanner scanner){
        System.out.println("Iveskite a verte:");
        int a = scanner.nextInt();
        System.out.printf("pi*(%d^2)=%.4f",a, PI*Math.pow(a,2));
    }

}
