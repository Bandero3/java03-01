package daytwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Iveskite skaiciu");
            int number = scanner.nextInt();
            System.out.printf("Jus ivedete %d\n", number);
            throw new RuntimeException("EAT A DICK CLOWN");
        }catch(InputMismatchException e){
            System.out.println("Not number");
        }catch(RuntimeException e){
//            System.out.println("Eat a dick clown");
            System.out.println(e.getMessage());
        }
    }
}
