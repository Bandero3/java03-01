package daytwo;

public class Radius {
    private static final float PI = 3.14F;

    public static void main(String[] args) {
        Radius radius = new Radius();
        System.out.printf("Jusu spindulys: %.2f", radius.getRadius(5));

    }

    private final float getRadius(float r) {
        return 2 * PI * r;
    }
}
