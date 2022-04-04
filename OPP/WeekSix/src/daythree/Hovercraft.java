package daythree;

public class Hovercraft implements SeaVehicle, LandVehicle {

    private int wheels;
    private int displacement;
    private String name;
    private int passengers;
    private int maxSpeed;

    public Hovercraft(int wheels, int displacement, String name, int passengers, int maxSpeed) {
        this.wheels = wheels;
        this.displacement = displacement;
        this.name = name;
        this.passengers = passengers;
        this.maxSpeed = maxSpeed;
    }

    public void enterLand() {
        drive();
    }

    public void enterSea() {
        launch();
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
        System.out.printf("%s vaziuoja\n", name);
    }

    @Override
    public int getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.printf("Prade %s plaukt\n", name);
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
