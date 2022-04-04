package daytwo;

import java.time.LocalDate;

public class MainAuto {
    public static void main(String[] args) {
        Transportas t1 = new Automobilis(LocalDate.of(2021,11,29),"raudona",555.5);
        t1.go();
        t1.getRegistrationDate();

        Transportas t2 = new Sunkvezimis(LocalDate.of(2000,10,11),"Ruda",555);
        t2.go();
        t2.getRegistrationDate();


    }
}
