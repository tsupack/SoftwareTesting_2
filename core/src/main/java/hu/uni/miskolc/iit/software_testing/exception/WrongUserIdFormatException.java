package hu.uni.miskolc.iit.software_testing.exception;

public class WrongUserIdFormatException extends Exception {
  private String message;

  public WrongUserIdFormatException(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "User Id format is wrong: " + message + ".";
  }
}
