package daythree;

import java.util.ArrayList;
import java.util.List;

public class DeviceMain {
    public static void main(String[] args) {
        Monitoring monitoring = new Monitoring();

        List<Device> devices = new ArrayList<>();
        devices.add(new Tv(true));
        devices.add(new Phone(true));
        devices.add(new Tablet(true));

        monitoring.pingAllDevices(devices);
        devices.get(2).setOn(false);
        monitoring.pingAllDevices(devices);
    }
}
