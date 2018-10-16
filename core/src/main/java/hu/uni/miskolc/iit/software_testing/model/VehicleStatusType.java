package hu.uni.miskolc.iit.software_testing.model;

import java.io.Serializable;

public enum VehicleStatusType implements Serializable {
  /**
   * Can be rented
   */
  FREE("FREE"),
  /**
   * Already reserved for a user
   */
  RESERVED("RESERVED"),
  /**
   * Not available to reservation or rent, currently under service or else
   */
  NOT_AVAILABLE("NOT_AVAILABLE");

  private final String value;

  VehicleStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }


}
