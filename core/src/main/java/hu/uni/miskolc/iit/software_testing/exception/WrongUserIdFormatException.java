package hu.uni.miskolc.iit.software_testing.exception;

public class WrongUserIdFormatException extends Exception {
  public WrongUserIdFormatException() {
  }

  public WrongUserIdFormatException(String message) {
    super(message);
  }

  public WrongUserIdFormatException(String message, Throwable cause) {
    super(message, cause);
  }

  public WrongUserIdFormatException(Throwable cause) {
    super(cause);
  }

  public WrongUserIdFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
