package hu.uni.miskolc.iit.software_testing.exception;

public class UserNotFoundException extends Exception {

  private String message;

  public UserNotFoundException(String s){
    this.message = s;
  }

  @Override
  public String toString(){
    return "User can not be found: " + message + ".";
  }
}
