package hu.uni.miskolc.iit.software_testing.exception;

public class RentNotFoundException extends Exception{
  private String message;

  public RentNotFoundException(String message){
    this.message = message;
  }

  @Override
  public String toString() {
    return "Rent with this id does not exist: " + message + ".";
  }
}
