package day.four;

public class EnumTest {
    public static void main(String[] args) {
        Measurments milimetras = Measurments.MILIMETRAS;
        System.out.println(milimetras);

        float a = 5.0f;
        float distanceCM =  a / Measurments.CENTIMETER.distance();
        System.out.println(distanceCM);

    }
}
