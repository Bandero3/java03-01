package daythree;

import java.util.List;

public class Monitoring {

    public void pingAllDevices(List<Device> devices) {
        System.out.println("---------Pinging started---------");
        for (Device device : devices) {
            try {
                System.out.printf("Device %s with id %d is: %s\n", device.getClass().getSimpleName(), device.getId(), device.ping());
            } catch (DeviceIsOffException e) {
                System.out.printf("Device %s with id %d is: %s\n", device.getClass().getSimpleName(), device.getId(), e.getMessage());
            }
        }
        System.out.println("---------Pinging finished---------");
    }
}
