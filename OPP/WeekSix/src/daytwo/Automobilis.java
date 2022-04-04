package daytwo;

import java.time.LocalDate;
import java.util.Formatter;

public class Automobilis extends Transportas{

    private final double autoTalpa;

    public Automobilis(LocalDate registrationDate, String color, double autoTalpa) {
        super(registrationDate, color);
        this.autoTalpa = autoTalpa;
    }

    @Override
    public void go() {
        System.out.println("Automobilis vaziuoja");
    }

    public double getAutoTalpa() {
        return autoTalpa;
    }
}
