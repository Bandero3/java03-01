package daythree;

import java.util.ArrayList;
import java.util.List;

public class MainVehicle {
    public static void main(String[] args) {
        Jeep jeep = new Jeep(4,"Jeep", 5,185);
        Vehicle jeep1 = new Jeep(4,"Jeep", 5,185);
        LandVehicle jeep2 = new Jeep(4,"Jeep", 5,185);

//        jeep2.getName();
//        jeep.getNumWheels();

        Hovercraft hovercraft = new Hovercraft(6,5,"Hovercraft",12,120);
        LandVehicle hovercraft2 = new Hovercraft(6,5,"Hovercraft2",12,120);
        SeaVehicle hovercraft3 = new Hovercraft(6,5,"Hovercraft3",12,120);
        Vehicle hovercraft4 = new Hovercraft(6,5,"Hovercraft4",12,120);

        PoliceCar police1 = new PoliceCar(4,"Police1", 5,185);
        Vehicle police2 = new PoliceCar(4,"Police2", 5,185);
        LandVehicle police3 = new PoliceCar(4,"Police3", 5,185);
        Emergency police4 = new PoliceCar(4,"Police4", 5,185);

        police1.soundSiren();
//        police2.soundSiren();
//        police3.soundSiren();
        police4.soundSiren();


        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(jeep);
        vehicles.add(jeep1);
        vehicles.add(jeep2);
        vehicles.add(hovercraft);
        vehicles.add(hovercraft2);
        vehicles.add(hovercraft3);
        vehicles.add(hovercraft4);
        vehicles.add(police1);
        vehicles.add(police2);
        vehicles.add(police3);
//        vehicles.add(police4);

        List<SeaVehicle> seaVehicles = new ArrayList<>();

        seaVehicles.add(hovercraft);
        seaVehicles.add(hovercraft3);


        callVehicle(vehicles);
    }

    private static void callVehicle(List<Vehicle> vehicles){
        for(Vehicle vehicle: vehicles){
            System.out.printf("%s %s %s\n", vehicle.getName(), vehicle.getMaxSpeed(),vehicle.getMaxPassengers());
            if(vehicle instanceof Jeep jeep){
                jeep.drive();
                jeep.soundHor();
            }
            if (vehicle instanceof Hovercraft hovercraft){
                hovercraft.enterLand();
                hovercraft.enterSea();

            }
        }
    }
}
