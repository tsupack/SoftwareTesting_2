package hu.uni.miskolc.iit.software_testing.model;

import java.io.Serializable;

public enum UserType implements Serializable {
  ADMIN("ADMIN"),
  USER("USER");

  private final String value;

  UserType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}
