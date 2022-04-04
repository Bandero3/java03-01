package daythree;

public abstract class Figure{
    private final double lenght;

    public Figure(double lenght) {
        this.lenght = lenght;
    }

    public abstract void getArea();
    public abstract void getPerimeter();

    public double getLenght() {
        return lenght;
    }
}
