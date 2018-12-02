package hu.uni.miskolc.iit.software_testing.model;

import java.util.Date;
import java.util.Objects;

public class Car {

  private int id;
  private String type;
  private String manufacturer;
  private VehicleStatusType carStatus;
  private int performance;
  private Date yearOfManufacture;
  private double rentCost;
  private int personSeats;
  private String plateNumber;
  private String carVIN;

  public Car(int id, String type, String manufacturer, VehicleStatusType carStatus, int performance, Date yearOfManufacture, double rentCost, int personSeats, String plateNumber, String carVIN) {
    this.id = id;
    this.type = type;
    this.manufacturer = manufacturer;
    this.carStatus = carStatus;
    this.performance = performance;
    this.yearOfManufacture = yearOfManufacture;
    this.rentCost = rentCost;
    this.personSeats = personSeats;
    this.plateNumber = plateNumber;
    this.carVIN = carVIN;
  }
  
  public String getPlateNumber() {
    return plateNumber;
  }

  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  public String getCarVIN() {
    return carVIN;
  }

  public void setCarVIN(String carVIN) {
    this.carVIN = carVIN;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public VehicleStatusType getCarStatus() {
    return carStatus;
  }

  public void setCarStatus(VehicleStatusType carStatus) {
    this.carStatus = carStatus;
  }

  public int getPerformance() {
    return performance;
  }

  public void setPerformance(int performance) {
    this.performance = performance;
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

  public int getPersonSeats() {
    return personSeats;
  }

  public void setPersonSeats(int personSeats) {
    this.personSeats = personSeats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Car car = (Car) o;
    return performance == car.getPerformance() &&
            Double.compare(car.getRentCost(), rentCost) == 0 &&
            personSeats == car.getPersonSeats() &&
            Objects.equals(id, car.getId()) &&
            Objects.equals(type, car.getType()) &&
            Objects.equals(manufacturer, car.getManufacturer()) &&
            Objects.equals(carStatus, car.getCarStatus()) &&
            Objects.equals(yearOfManufacture, car.getYearOfManufacture());
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = 31 * (int)getId();
    result = 31 * result + (getType() != null ? getType().hashCode() : 0);
    result = 31 * result + (getManufacturer() != null ? getManufacturer().hashCode() : 0);
    result = 31 * result + (getYearOfManufacture() != null ? getYearOfManufacture().hashCode() : 0);
    temp = Double.doubleToLongBits(getRentCost());
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + getPersonSeats();
    temp = Double.doubleToLongBits(getPerformance());
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + (getCarStatus() != null ? getCarStatus().hashCode() : 0);
    result = 31 * result + (getPlateNumber() != null ? getPlateNumber().hashCode() : 0);
    result = 31 * result + (getCarVIN() != null ? getCarVIN().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Car{" +
            "id='" + id + '\'' +
            ", type='" + type + '\'' +
            ", manufacturer='" + manufacturer + '\'' +
            ", carStatus='" + carStatus + '\'' +
            ", performance=" + performance +
            ", yearOfManufacture=" + yearOfManufacture +
            ", rentCost=" + rentCost +
            ", personSeats=" + personSeats +
            "plateNumber='" + plateNumber + '\'' +
            ", vehicleIdentificationNumber='" + carVIN + '\'' +
            '}';
  }
}
