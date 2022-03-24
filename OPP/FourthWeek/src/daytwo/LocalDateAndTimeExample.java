package daytwo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateAndTimeExample {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTime);
        System.out.println(dateTime.plusYears(10));
        System.out.println(dateTime.toLocalDate());
        System.out.println(dateTime.getDayOfMonth());

        LocalDate localDate = dateTime.toLocalDate();
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));
    }
}
