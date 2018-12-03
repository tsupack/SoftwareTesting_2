package hu.uni.miskolc.iit.software_testing.exception;

public class RentAlreadyExistsException extends Exception {
  public RentAlreadyExistsException() {
  }

  public RentAlreadyExistsException(String message) {
    super(message);
  }

  public RentAlreadyExistsException(String message, Throwable cause) {
    super(message, cause);
  }

  public RentAlreadyExistsException(Throwable cause) {
    super(cause);
  }

  public RentAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}

