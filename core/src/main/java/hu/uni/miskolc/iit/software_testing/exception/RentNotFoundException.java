package hu.uni.miskolc.iit.software_testing.exception;

public class RentNotFoundException extends Exception {
  public RentNotFoundException() {
  }

  public RentNotFoundException(String message) {
    super(message);
  }

  public RentNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public RentNotFoundException(Throwable cause) {
    super(cause);
  }

  public RentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
