package daythree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int enterValue(Scanner scanner){
        while(true) {
            try {
                System.out.println("Iveskite sveikaji skaiciu");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ivestas neteisingas skaicius");
                scanner.next();
            }
        }
    }
}
