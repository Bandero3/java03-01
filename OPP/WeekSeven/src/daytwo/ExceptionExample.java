package daytwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) throws ServerNotAwaylableException {
        //throw new Exception();

        Scanner scanner = new Scanner(System.in);
/*        System.out.println("Iveskite skaiciu");

        try{
//            scanner.close();
            int number = scanner.nextInt();

            System.out.printf("Jus ivedete %d\n", number);
//            throw new Exception();
        }catch (InputMismatchException | IllegalStateException e){
//        }catch (Exception e){
            System.out.println("Ivedete ne skaiciu");
        }*//*catch (IllegalStateException e){
            System.out.println("musu Scanner closed");
        }*//*catch (Exception e){
            System.out.println("Kazkas blogai");
        }finally {
            System.out.println("Visada bus iskvieciamas");
        }

        try {
            testExample();
        } catch (Exception e) {
            e.printStackTrace();
        }

        testRuntimeException();*/
        try{
            exceptionExample(scanner);
        } catch (IncorrectUserInputRuntimeException e){
            System.out.println(e.getMessage());
            System.out.println(e.getAge());
        }

        throw new ServerNotAwaylableException();

    }

    public static void testExample() throws Exception {
        throw new Exception();
    }

    public static void testRuntimeException(){
        throw new RuntimeException("New runtime exception");
    }

    private static void exceptionExample(Scanner scanner){
        System.out.println("Iveskite savo amziu:");
        try{
            int age = scanner.nextInt();
            System.out.println("Amzius: " + age);
        }catch(InputMismatchException e){
//            System.out.println("Ivedete bloga amziu");
            throw new IncorrectUserInputRuntimeException("Ivedete bloga amziu", 54);
        }
    }
}
