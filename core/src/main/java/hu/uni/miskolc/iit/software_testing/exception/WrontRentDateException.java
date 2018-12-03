package hu.uni.miskolc.iit.software_testing.exception;

public class WrontRentDateException extends Exception {
  public WrontRentDateException() {
  }

  public WrontRentDateException(String message) {
    super(message);
  }

  public WrontRentDateException(String message, Throwable cause) {
    super(message, cause);
  }

  public WrontRentDateException(Throwable cause) {
    super(cause);
  }

  public WrontRentDateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
