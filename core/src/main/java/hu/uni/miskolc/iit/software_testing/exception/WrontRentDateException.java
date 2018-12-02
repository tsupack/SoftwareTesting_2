package hu.uni.miskolc.iit.software_testing.exception;

public class WrontRentDateException extends Exception {
  private String message;

  public WrontRentDateException(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "The given date is wrong: " + message + ".";
  }
}
