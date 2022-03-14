package dayfour;

import java.util.Random;

public class TaskOne {
    private static final int MAX = 100;

    public static void main(String[] args) {
        TaskOne task = new TaskOne();
        Random random = new Random();
        int a = random.nextInt(MAX) + 1;
        int b = random.nextInt(MAX) + 1;
        int c = random.nextInt(MAX) + 1;
        System.out.printf("a: %d | b: %d | c: %d\n", a, b, c);
        task.printMaxNumber(a, b, c);
    }

    private void printMaxNumber(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.printf("Max value: %d", a);
        } else if (b >= a && b >= c) {
            System.out.printf("Max value: %d", b);
        } else {
            System.out.printf("Max value: %d", c);
        }
    }
}
