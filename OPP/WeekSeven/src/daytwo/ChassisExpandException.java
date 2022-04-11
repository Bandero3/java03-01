package daytwo;

public class ChassisExpandException extends Exception{
    private final String reason;

    public ChassisExpandException(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
