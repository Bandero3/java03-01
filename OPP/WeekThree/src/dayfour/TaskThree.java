package dayfour;

import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];

        for (int i = 0; i < 100000; i++) {
            int b = random.nextInt(10);
            a[b] += 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d atspausdino %d kartu\n", i+1, a[i]);
        }
    }
}
