package day.four;

public enum Measurments {
    MILIMETRAS(0.001f, "mm"),
    CENTIMETER(0.01f, "cm"),
    DECIMETRAS(0.1f, "dc"),
    METRAS(1.0f, "m"),
    KILOMETRAS(1000.0f, "km");

    public final float distance;
    public final String unit;

    Measurments(float distance, String unit) {
        this.distance = distance;
        this.unit = unit;
    }

    public float distance() {
        return distance;
    }

    public String unit() {
        return unit;
    }
}
