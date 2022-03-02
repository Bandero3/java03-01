package day.three;

import java.util.Scanner;

public class NewTask {
    public static void main(String[] args) {
        NewTask newTask = new NewTask();
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Iveskite skaiciu");
        int numb = scanner.nextInt();
        newTask.oddOrEven(numb);
        System.out.println("Iveskite zodi ir sekanti zodi paliginimui");
        String word = scanner.next();
        String compare = scanner.next();
        System.out.println(newTask.hasWordLabas(word, compare));*/
        System.out.println("Iveskite x");
        int x = scanner.nextInt();
        newTask.calculateFormula(x);

    }

    public void oddOrEven(int numb) {
        if (numb % 2 == 0) {
            System.out.println("Lyginis");
        } else {
            System.out.println("Nelyginis");
        }
    }

    public boolean hasWordLabas(String word, String compare) {
        return word.contains(compare);
    }

    public void calculateFormula(int x){
        if(x % 2 == 0){
            System.out.printf("f(x) = 2x+8 || resultas: %s",(2*x)+8);
        }else{
            System.out.printf("f(x) = 21-7x || resultas: %s",21-(7*x));
        }
    }
}
