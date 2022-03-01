import java.text.DecimalFormat;
import java.util.Random;

public class GeoLocation {
    private double lat;
    private double lon;
    private int numLocation = 0;

    public GeoLocation() {

        this.lat = (Math.random() * (90 - (-90))+(-90));
        this.lon = (Math.random() * (90 - (-90))+(-90));
        this.numLocation += 1;
    }

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.######");

        GeoLocation geoLocation1 = new GeoLocation();
        GeoLocation geoLocation2 = new GeoLocation();
        System.out.println(df.format(geoLocation1.lat) + ", " + df.format(geoLocation1.lon) + ", " + geoLocation1.numLocation);
        System.out.println(df.format(geoLocation2.lat) + ", " + df.format(geoLocation2.lon) + ", " + geoLocation2.numLocation);
    }
}
