package hu.uni.miskolc.iit.software_testing.beans;

import com.fasterxml.jackson.annotation.JsonFormat;
import hu.uni.miskolc.iit.software_testing.model.Rent;

import java.util.Date;

public class RentDaoBean {
  private long id;
  private long userId;
  private long vehicleId;

  @JsonFormat(pattern="yyyy-MM-dd", timezone = "Europe/Budapest")
  private Date startDate;

  @JsonFormat(pattern="yyyy-MM-dd", timezone = "Europe/Budapest")
  private Date endDate;
  private int daysUsed;
  /**
   * Traveled distance with the rented car
   */
  private int distance;

  private int dailyPrice;
  /**
   * Price per km
   */
  private int distancePrice;
  private boolean isPaid;


  public boolean isPaid() {
    return isPaid;
  }

  public void setPaid(boolean paid) {
    isPaid = paid;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public int getDaysUsed() {
    return daysUsed;
  }

  public void setDaysUsed(int daysUsed) {
    this.daysUsed = daysUsed;
  }

  public int getDistance() {
    return distance;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  public int getDailyPrice() {
    return dailyPrice;
  }

  public void setDailyPrice(int dailyPrice) {
    this.dailyPrice = dailyPrice;
  }

  public int getDistancePrice() {
    return distancePrice;
  }

  public void setDistancePrice(int distancePrice) {
    this.distancePrice = distancePrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Rent rent = (Rent) o;

    if (id != rent.getId()) return false;
    if (userId != rent.getUserId()) return false;
    if (vehicleId != rent.getVehicleId()) return false;
    if (distance != rent.getDistance()) return false;
    if (Double.compare(rent.getDailyPrice(), dailyPrice) != 0) return false;
    if (Double.compare(rent.getDistancePrice(), distancePrice) != 0) return false;
    if (isPaid != rent.isPaid()) return false;
    if (!startDate.equals(rent.getStartDate())) return false;
    return endDate.equals(rent.getEndDate());
  }

  public Rent extract()
  {
    return new Rent(
    this.getId(),
    this.getUserId(),
    this.getVehicleId(),
    this.getStartDate(),
    this.getEndDate(),
    this.getDaysUsed(),
    this.getDistance(),
    this.getDailyPrice(),
    this.getDistancePrice(),
    this.isPaid()
    );
  }
}
