package dayfour;

import java.util.Random;
import java.util.Scanner;

public class TeacherTwo {

    public static final int MAX = 10;

    public static void main(String[] args) {
        Random random = new Random();
        int numb = random.nextInt(100) + 1;
        TeacherTwo task = new TeacherTwo();
        task.luckyNumber(numb);

    }

    private void luckyNumber(int numb) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        do {
            System.out.printf("Jusu %d spejimas\n",(i+1));
            int n = scanner.nextInt();
            if (n == numb) {
                System.out.println("Atspejote");
                break;
            } else {
                checkLowOrHigh(numb, n);
            }
            i++;

        } while (i!= MAX);

        if(i == 10){
            System.out.println("Spejimai baigesi, bandykite dar karta");
        }
    }

    private void checkLowOrHigh(int numb, int n) {
        if (n > numb) {
            System.out.printf("Jusu %d spejimas yra per didelis\n", n);
        } else {
            System.out.printf("Jusu %d spejimas yra per mazas\n", n);
        }
    }
}
