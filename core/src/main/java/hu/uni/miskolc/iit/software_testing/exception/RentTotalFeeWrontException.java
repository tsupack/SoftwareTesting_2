package hu.uni.miskolc.iit.software_testing.exception;

public class RentTotalFeeWrontException extends Exception {
  public RentTotalFeeWrontException() {
  }

  public RentTotalFeeWrontException(String message) {
    super(message);
  }

  public RentTotalFeeWrontException(String message, Throwable cause) {
    super(message, cause);
  }

  public RentTotalFeeWrontException(Throwable cause) {
    super(cause);
  }

  public RentTotalFeeWrontException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
