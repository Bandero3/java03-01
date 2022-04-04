package daytwo;

import java.time.LocalDate;

public class Sunkvezimis extends Transportas{

    private final double MaxSvoris;

    public Sunkvezimis(LocalDate registrationDate, String color, double maxSvoris) {
        super(registrationDate, color);
        MaxSvoris = maxSvoris;
    }

    @Override
    public void go() {
        System.out.println("Sunkvezimis vaziuoja");
    }

    public double getMaxSvoris() {
        return MaxSvoris;
    }
}
