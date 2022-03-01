package day.one;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        ScannerTask scannerTask = new ScannerTask();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 2 skaicius");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%s + %s = %s", a,b,scannerTask.sum(a,b));
    }
    public int sum(int a, int b){
        int sum = a+b;
        return sum;
    }

}
