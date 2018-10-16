package hu.uni.miskolc.iit.software_testing.model;

import java.util.Date;

public class SearchCarRequest {

  private String manufacturer;
  private Date yearOfManufacture;
  private double rentCost;

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public Date getYearOfManufacture() {
    return yearOfManufacture;
  }

  public void setYearOfManufacture(Date yearOfManufacture) {
    this.yearOfManufacture = yearOfManufacture;
  }

  public double getRentCost() {
    return rentCost;
  }

  public void setRentCost(double rentCost) {
    this.rentCost = rentCost;
  }
}
