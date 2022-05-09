package daytwo;

import java.io.Serializable;

public class Driver{
    private final String name;
    private final String car;
    private final String plateNumb;
    private int rida;

    public Driver(String name, String car, String plateNumb, int rida) {
        this.name = name;
        this.car = car;
        this.plateNumb = plateNumb;
        this.rida = rida;
    }

    public String getName() {
        return name;
    }

    public String getCar() {
        return car;
    }

    public String getPlateNumb() {
        return plateNumb;
    }

    public int getRida() {
        return rida;
    }

    public void setRida(int rida) {
        this.rida = rida;
    }

    @Override
    public String toString() {
        return name + ", " + car + ", " + plateNumb + ", " + rida;
    }
}
