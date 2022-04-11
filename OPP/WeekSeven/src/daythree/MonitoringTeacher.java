package daythree;

import java.util.List;

public class MonitoringTeacher {

    public void pingAllDevices(List<TeacherDevice> devices){
        System.out.println("------Pinging started---------");
        for(TeacherDevice device: devices){
            try{
                device.ping();
                System.out.printf("Device %s with id %d is On\n",device.getName(),device.getId());
            } catch(DeviceOffExceptionTeacher e){
                System.out.printf("Device %s with id %d is OFF\n",device.getName(),device.getId());
            }

        }

        System.out.println("------Pinging finished---------");
    }
}
