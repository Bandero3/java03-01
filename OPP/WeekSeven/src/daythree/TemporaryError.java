package daythree;

import daytwo.ChassisExpandException;


public class TemporaryError extends ChassisExpandException {

    public TemporaryError(String reason) {
        super(reason);
    }

}
