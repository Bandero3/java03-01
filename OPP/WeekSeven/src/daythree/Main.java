package daythree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Jusu irasytas sveikasis skaicius: %d\n", input.enterValue(scanner));
    }
}
