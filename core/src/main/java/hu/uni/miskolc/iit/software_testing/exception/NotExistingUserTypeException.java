package hu.uni.miskolc.iit.software_testing.exception;

public class NotExistingUserTypeException extends Exception {
    public NotExistingUserTypeException() {
    }

    public NotExistingUserTypeException(String message) {
        super(message);
    }

    public NotExistingUserTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotExistingUserTypeException(Throwable cause) {
        super(cause);
    }

    public NotExistingUserTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
