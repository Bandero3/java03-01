package day.three;

public class CalculatorMethod {

    public void calculate(int numbOne, String operator, int numbTwo) {
        switch(operator){
            case "+" -> System.out.printf("%s + %s = %s",numbOne, numbTwo, numbOne+numbTwo);
            case "-" -> System.out.printf("%s - %s = %s",numbOne, numbTwo, numbOne-numbTwo);
            case "/" -> System.out.printf("%s / %s = %s",numbOne, numbTwo, numbOne/numbTwo);
            case "*" -> System.out.printf("%s * %s = %s",numbOne, numbTwo, numbOne*numbTwo);
            case "^" -> System.out.printf("%s ^ %s = %s",numbOne, numbTwo,Math.pow(numbOne,numbTwo));
        }
    }
}
