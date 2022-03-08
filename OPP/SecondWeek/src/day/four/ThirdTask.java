package day.four;

import static java.lang.Character.toUpperCase;

public class ThirdTask {
    public static void main(String[] args) {
        char [] mass = new char[4];

        String word = "Java";

        mass[0] = toUpperCase(word.charAt(0));
        mass[1] = toUpperCase(word.charAt(1));
        mass[2] = toUpperCase(word.charAt(2));
        mass[3] = toUpperCase(word.charAt(3));

        System.out.printf("%s %s %s %s\n", mass[0],mass[1],mass[2],mass[3]);
        System.out.println(mass);
    }
}
