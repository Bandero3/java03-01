package dayfour;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    int year;
    int month;
    int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void set(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void print(){
        LocalDate localDate = LocalDate.of(year,month,day);
        System.out.println(localDate);
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy MM dd")));
    }
}
