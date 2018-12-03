package hu.uni.miskolc.iit.software_testing.exception;

public class NotExistingVehicleStatusException extends Exception {
    public NotExistingVehicleStatusException() {
    }

    public NotExistingVehicleStatusException(String message) {
        super(message);
    }

    public NotExistingVehicleStatusException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotExistingVehicleStatusException(Throwable cause) {
        super(cause);
    }

    public NotExistingVehicleStatusException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
