package daythree;

public class TeacherDevice {
    private static int count = 0;
    private final int id;
    private final String name;
    private boolean isOn;

    public TeacherDevice(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
        id = count++;
    }

    public void ping(){
        if(!isOn){
            throw new DeviceOffExceptionTeacher();
        }
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
