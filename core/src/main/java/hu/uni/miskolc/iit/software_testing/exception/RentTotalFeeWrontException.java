package hu.uni.miskolc.iit.software_testing.exception;

public class RentTotalFeeWrontException extends Exception {
  private String message;

  public RentTotalFeeWrontException(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "The given free is wrong: " + message + ".";
  }
}
