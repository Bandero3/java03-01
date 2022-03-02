package day.three;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite viena skaiciu \"operatoriu\" antra skaiciu");


        int numbOne = scanner.nextInt();
        String operator = scanner.next();
        int numbTwo = scanner.nextInt();
        System.out.println(scanner.tokens());

        CalculatorMethod calculatorMethod = new CalculatorMethod();
        calculatorMethod.calculate(numbOne,operator,numbTwo);
    }
}

