package daytwo;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EnterTime {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Iveskite laika: ");
        Scanner sc = new Scanner(System.in);
        String textFromConsole = sc.next();
        sc.close();


        LocalTime time = LocalTime.parse(textFromConsole, f);
        System.out.printf("Ivestas laikas %s pridejus 2 val ir 15 min bus %s\n", time, time.plusHours(2).plusMinutes(15));

        LocalTime currentTime = LocalTime.now();
        if(time.isBefore(currentTime)){
            System.out.println("Jusu ivestas laikas ankstesnis");
        } else {
            System.out.println("Jusu ivestas laikas velesnis");
        }
    }
}
