package daytwo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeTask {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now().minusHours(3).plusDays(5);
        System.out.println(time.format(DateTimeFormatter.ofPattern("yyyy MM dd HH:mm")));
//        time = time.minusHours(3);
//        System.out.println(time.minusHours(3).plusDays(5).format(DateTimeFormatter.ofPattern("yyyy MM dd HH:mm")));
    }
}
