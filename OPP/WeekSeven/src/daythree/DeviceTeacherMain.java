package daythree;

import java.util.List;

public class DeviceTeacherMain {
    public static void main(String[] args) {
        MonitoringTeacher monitoring = new MonitoringTeacher();
        List<TeacherDevice> devices = List.of(new MouseTeacher(true), new Keyboard(true));
        monitoring.pingAllDevices(devices);
        devices.get(1).setOn(false);
        monitoring.pingAllDevices(devices);

    }
}
