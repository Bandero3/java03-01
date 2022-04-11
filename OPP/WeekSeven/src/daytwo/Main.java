package daytwo;

public class Main {
    public static void main(String[] args) {
        Address address = new Address(null);
        Address address2 = new Address(new City("Vilnius"));

        System.out.println(getCityName(address));
        System.out.println(getCityName(address2));

    }

    public static String getCityName(Address address) {
        City city = address.getCity();
        if (city == null) {
            return "No city";
        }
        return city.getName();
    }

}
