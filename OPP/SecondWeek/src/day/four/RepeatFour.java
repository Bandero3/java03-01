package day.four;

import java.util.Scanner;

public class RepeatFour {
    private static final String REPLACEMENT = "?"; //constant
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 2 skaicius ir simboli tarp ju pvz 10 + 10");
        String line = scanner.nextLine().replaceAll(" ", "");
        RepeatFour repeatFour = new RepeatFour();

        repeatFour.makeAction(line);
    }

    private void makeAction(String line){
        int actionIndex = getActionIndex(line);
        char action = line.charAt(actionIndex);

        Calculator calculator = new Calculator();

        double a = getNumber(line, 0, actionIndex);
        double b = getNumber(line, actionIndex+1, line.length());


        switch (action){
            case '+' -> System.out.println(calculator.sum(a,b));
            case '-' -> System.out.println(calculator.minus(a,b));
            case '*' -> System.out.println(calculator.multiply(a,b));
            case '/' -> {
                double result = calculator.divider(a,b);
                if(result > 0.0){ //or !=0
                    System.out.println(result);
                }
            }
            case '^' -> System.out.println(calculator.pow(a,(int)b));
        }
    }
    private double getNumber(String line, int startIndex, int endIndex){
        line = line.substring(startIndex,endIndex);

        return Double.parseDouble(line);
    }

    private int getActionIndex(String line){
        line = line.replaceAll("[^0-9]",REPLACEMENT);
        return line.indexOf(REPLACEMENT);
    }
}
