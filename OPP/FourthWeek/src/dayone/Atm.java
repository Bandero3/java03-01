package dayone;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite saskaitos likuti");
        double savings = scanner.nextDouble();
        int attemptCounter = 0;

        while (savings > 0) {
            System.out.printf("Iveskite kiek pinigu norite nusimt, saskaitos likutis %.2f eur\n", savings);
            double money = scanner.nextDouble();


            for (int i = 2; i > 0; i--) {
                if (money > savings) {
                    ++attemptCounter;
                    System.out.printf("Suma kuria ivedete didesne uz saskaitos likuti, turite dar %d bandymus\n", i);
                    System.out.println(attemptCounter);
                    money = scanner.nextDouble();
                } else {
                    break;
                }
            }
            if(attemptCounter == 3){
                System.out.println("Uzblokavot savo kortele");
                return;
            } else{
                savings -= money;
                attemptCounter = 0;
            }

        }
        System.out.println("Jusu saskaitos likutis 0.00 eur");

    }
}
