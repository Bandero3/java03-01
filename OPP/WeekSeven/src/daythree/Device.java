package daythree;

public class Device {
    static int counter = 0;
    private boolean isOn;
    private final int id;

    public Device(boolean isOn) {
        this.isOn = isOn;
        id = counter++;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getId() {
        return id;
    }

    public String ping() throws DeviceIsOffException {
        if (!isOn()) {
            throw new DeviceIsOffException("Off");
        } else return "On";
    }
}
