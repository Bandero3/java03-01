package day.three;

import java.util.Scanner;

public class TeacherTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite menesion numeri");

        int numb = scanner.nextInt();

        TeacherTask teacherTask = new TeacherTask();
        teacherTask.printMonth(numb);
    }

    private void printMonth(int numb){
        if (numb < 1 || numb > 12){
            return; //stops application
        }

        if (numb % 2 == 0){
            evenMonth(numb);
        }else {
            oddMonth(numb);
        }
    }

    private void evenMonth(int numb){
        switch (numb) {
            case 2 -> System.out.println("VASARIS");
            case 4 -> System.out.println("BALANDIS");
            case 6 -> System.out.println("BIRŽELIS");
            case 8 -> System.out.println("RUGPJŪTIS");
            case 10 -> System.out.println("SPALIS");
            case 12 -> System.out.println("GRUODIS");
        }
    }
    private void oddMonth(int numb){
        switch (numb) {
            case 1 -> System.out.println("sausis");
            case 3 -> System.out.println("kovas");
            case 5 -> System.out.println("gegužė");
            case 7 -> System.out.println("liepa");
            case 9 -> System.out.println("rugsėjis");
            case 11 -> System.out.println("lapkritis");
        }
    }

}
