package dayfour;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JarMain main = new JarMain();
        main.menu();

        String action = scanner.nextLine();
        main.selectAction(scanner,action,args);


    }

    private void selectAction(Scanner scanner, String action, String[] args){
        CalculatorService service = new CalculatorService();


        int a = getCorrectNumber(args.length > 0? args[0] : null, scanner);
        int b = getCorrectNumber(args.length > 1? args[1] : null, scanner);


        switch(action){
            case "a" -> System.out.printf("Suma yra: %d\n",service.sum(a,b));
            case "b" -> System.out.printf("Skirtumas yra: %d\n",service.minus(a,b));
            case "c" -> System.out.printf("Daugybos rezultatas: %d",service.multiply(a,b));
            case "d" -> divider(service,a,b);
            default -> System.out.println("Nera tokio veiksmo");
        }

    }

    private void divider(CalculatorService service, int a, int b){
        try{
            int result = service.divider(a,b);
            System.out.printf("Dalybos rezultatas: %d",result);
        } catch (ArithmeticException e){
            System.out.println("Dalyba is nulio negalima");
        }
    }

    private int getCorrectNumber(String value, Scanner scanner){
        try{
            return Integer.parseInt(value);
        } catch (NumberFormatException e){}

        while(true){
            try{
                System.out.println("Iveskite skaiciu:");
                return scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Blogas formatas");
                scanner.nextLine();
            }

        }
    }

    public void menu(){
        System.out.println("""
                a. sum
                b. minus
                c. multiply
                d. divider
                """);
    }

}
