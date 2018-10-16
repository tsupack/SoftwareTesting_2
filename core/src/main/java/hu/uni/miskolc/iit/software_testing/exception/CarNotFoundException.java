package hu.uni.miskolc.iit.software_testing.exception;

public class CarNotFoundException extends Exception{
  private String message;

  public CarNotFoundException(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "Car can not be found " + message + ".";
  }
}
