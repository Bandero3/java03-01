package day.one;

import java.util.Locale;

public class Task {
    public static void main(String[] args) {
        System.out.println("Pirmoji programa!");
        System.out.println("Ismoksiu programuot \"Java\"");
        PrintNumb(5);
        Calculate(5,6);
        ArithmeticMean(5,2);

        int a = 5;
        int b = 6;
        int z= a;
        a=b;
        b=z;
        System.out.printf("a: %s | b: %s", a,b);

        TextChange("Namas");
        Numbers(7853);

    }

    public static void PrintNumb(int a) {
        System.out.printf("Jus ivedete skaiciu %s",a);

    }
    public static void Calculate(int a, int b){
        System.out.println(a+b);
    }
    public static void ArithmeticMean(double a, double b){
        System.out.println((a+b)/2);
    }

    public static void Numbers(int a){
        int b=a/1000;;
        a = a%1000;
        int c = a/100;
        a = a%100;
        int d = a/10;
        a = a%10;
        System.out.printf("a: %s b: %s c: %s d: %s",b,c,d,a);
    }

    public static void TextChange(String text){
        text = text.replace("s","i");
        System.out.println(text);
        text = text.toUpperCase(Locale.ROOT);
        System.out.println(text);
        text = text.substring(2,4);
        System.out.println(text);
        text += "ma";
        System.out.println(text);
        text = text.replace("m","n");
        System.out.println(text);
        System.out.println(text.indexOf("n"));
    }
}