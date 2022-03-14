package dayfour;

import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    private static final int MAX = 100;
    public static void main(String[] args) {
        TaskTwo task = new TaskTwo();
        Scanner scanner = new Scanner(System.in);
        task.luckyTry(scanner);

    }

    private void luckyTry(Scanner scanner){
        Random random = new Random();
        int a = random.nextInt(MAX)+1;
        int b;
        for(int i = 0; i < 10; i++){
            System.out.println("Bandykite atspeti random skaiciu");
            b = scanner.nextInt();
            if(a<b){
                System.out.println("Ivestas skaicius per didelis");
            }else if(a>b){
                System.out.println("Ivestas skaicius per mazas");
            } else{
                System.out.printf("Valio!!! Atspejote, skaicius buvo %d", a);
                return;
            }
        }
        System.out.printf("10 bandymu baigesi, skaicius buvo %d", a);
    }
}
