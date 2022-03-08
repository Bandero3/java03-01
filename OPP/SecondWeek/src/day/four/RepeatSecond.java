package day.four;

import java.util.Scanner;

public class RepeatSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu:");
        int number = scanner.nextInt();
        RepeatSecond repeatSecond = new RepeatSecond();
        repeatSecond.calculateFunction(number);
    }

    private void calculateFunction(int number){
        int f;
        if( number > 0){
            f = 2* number + 8;
        } else {
            f = 21 -(7 * number);
        }
        System.out.printf("Resultatas yra: %s", f);
    }
}
