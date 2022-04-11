package dayfour;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskOne task = new TaskOne();
        int a = task.getCorrectNumber(scanner,"Iveskite a intervala:");
        int b = task.getCorrectNumber(scanner,"Iveskite b intervala:");

        for(int i = a; i <= b; i++){
            if(task.isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }

    private boolean isPrimeNumber(int numb){
        for(int i = 2; i <= numb / 2; i++){
            if(numb % i == 0){
                return false;
            }
        }
        return true;
    }

    private int getCorrectNumber(Scanner scanner, String text){
        while(true){
            try{
                System.out.println(text);
                int number = scanner.nextInt();
                if(number <= 0){
                    System.out.println("Skaicius turi buti didesnis uz 0");
                    continue;
                }
                return number;
            } catch(InputMismatchException e){
                System.out.println("Neskaicius");
                scanner.nextLine();
            }
        }
    }
}
