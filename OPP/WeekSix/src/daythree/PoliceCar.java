package daythree;

public class PoliceCar implements Emergency, LandVehicle {
    private int wheels;
    private String name;
    private int passengers;
    private int maxSpeed;

    public PoliceCar(int wheels, String name, int passengers, int maxSpeed) {
        this.wheels = wheels;
        this.name = name;
        this.passengers = passengers;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void soundSiren() {
        System.out.println("Skamba sirena");
    }

    @Override
    public int getNumWheels() {
        return wheels;
    }

    @Override
    public void setNumbWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void drive() {
        System.out.println("Policijos auto vaziuoja");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxPassengers() {
        return passengers;
    }

    @Override
    public void setMaxPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
