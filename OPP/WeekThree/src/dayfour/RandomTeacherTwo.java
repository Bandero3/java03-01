package dayfour;

import java.util.Random;
import java.util.Scanner;

public class RandomTeacherTwo {
    public static void main(String[] args) {
        Random random = new Random();
        int first = random.nextInt(6)+1;
        int second = random.nextInt(6)+1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Spekite kauliuku skaiciu suma");
        int numb = scanner.nextInt();
        int sum = first+second;
        if(sum > numb){
            System.out.printf("Spejimas - %d. Reijeko speti %d didesni skaiciu", numb, (sum-numb));
        }else if(sum<numb){
            System.out.printf("Spejimas - %d. Reijeko speti %d mazesni skaiciu", numb, (numb-sum));
        }else {
            System.out.println("Atspejote!!!");
        }
    }
}
