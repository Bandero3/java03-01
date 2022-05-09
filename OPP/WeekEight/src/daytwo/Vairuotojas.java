package daytwo;

public class Vairuotojas {
    private final String name;
    private final String car;
    private final String number;
    private int km;

    public Vairuotojas(String name, String car, String number, int km) {
        this.name = name;
        this.car = car;
        this.number = number;
        this.km = km;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name);
        sb.append(",").append(car).append(",").append(number).append(",").append(km);
        return sb.toString();
    }
}
