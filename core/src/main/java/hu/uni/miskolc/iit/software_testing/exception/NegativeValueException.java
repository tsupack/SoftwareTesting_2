package hu.uni.miskolc.iit.software_testing.exception;

public class NegativeValueException extends Exception {
  private String message;

  public NegativeValueException(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "The value of the followings are negative: " + message + ".";
  }
}