package hu.uni.miskolc.iit.software_testing.exception;

public class RentAlreadyExistsException extends Exception {
  private String message;

  public RentAlreadyExistsException(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "Rent already exists with this ID: " + message + ".";
  }
}

