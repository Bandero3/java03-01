package daytwo;

import java.util.Scanner;

public class TaskMain {
    static boolean runProgram = true;

    public static void main(String[] args) {
        Tank tank = new Tank();
        Scanner sc = new Scanner(System.in);


        while (runProgram) {
            System.out.printf("[s] - ejimas i Siaure\n" +
                    "[r] - ejimas i Rytus\n" +
                    "[p] - ejimas i Pietus\n" +
                    "[v] - ejimas i Vakarus\n" +
                    "[*] - suvis\n" +
                    "[i] - info\n" +
                    "[x] - pabaiga\n");
            moveTrigger(sc, tank);
        }
    }

    public static void moveTrigger(Scanner scanner, Tank tank) {
        do {
            String string = scanner.nextLine();
            switch (string) {
                case "[s]" -> {tank.pirmyn(); return;}
                case "[r]" -> {tank.desinen(); return;}
                case "[p]" -> {tank.atgal(); return;}
                case "[v]" -> {tank.kairen(); return;}
                case "[*]" -> {tank.suvis(); return;}
                case "[i]" -> {tank.info(); return;}
                case "[x]" -> {System.out.println("Uzbaigiam programa"); runProgram = false; return;}
                default -> {System.out.println("Blogas ivedimas, iveskite ejima pakartotinai");continue;}
            }
        } while (true);
    }

    /*    public static String getMove(Scanner scanner) {
        String move = scanner.next();
        while (true) {
            if (!move.equals("[s]") && !move.equals("[r]") && !move.equals("[p]") && !move.equals("[v]") && !move.equals("[*]") && !move.equals("[i]") && !move.equals("[x]")) {
                System.out.println("Blogas ivedimas, iveskite ejima pakartotinai");
                move = scanner.next();
                continue;
            }
            return move;
        }
    }*/
}
