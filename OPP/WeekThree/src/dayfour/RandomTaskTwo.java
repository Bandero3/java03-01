package dayfour;

import java.util.Random;
import java.util.Scanner;

public class RandomTaskTwo {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(6)+1;
        int b = random.nextInt(6)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Atspekite dveju ismestu kauliuku skaiciu suma");
        int c = scanner.nextInt();

        int sum = a+b;
        if(c > sum){
            System.out.printf("Spejimas %d, reikejo speti %d maziau nes isrideno %d ir %d", c,c-sum, a,b);
        }else if(c<sum){
            System.out.printf("Spejimas %d, reikejo speti %d daugiau nes isrideno %d ir %d", c,sum-c,a,b);
        }else{
            System.out.printf("Atspejote, suma buvo %d + %d = %d nes isrideno %d ir %d", a,b,sum);
        }
    }
}
