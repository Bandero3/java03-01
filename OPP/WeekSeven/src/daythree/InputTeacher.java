package daythree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputTeacher {

    public int getCorrectNumber(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.println("Iveskite skaiciu");
                return scanner.nextInt();
            } catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("Blogas formatas, pakartokite");
            }
        }
    }
}
