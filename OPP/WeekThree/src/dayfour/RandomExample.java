package dayfour;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(10)+1);
        System.out.println(random.nextInt());

        int min = 10;
        int max = 20;
        System.out.println(random.nextInt(max - min)+min+1);
        System.out.println(random.nextInt(min,max)+1);

        System.out.println((Math.random() * (max - min) + min+1));
        System.out.println((int)(Math.random() * (max - min) + min+1));
    }
}
