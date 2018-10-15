package hu.uni.miskolc.iit.software_testing.model;

import java.util.Date;

public class Rent {

  private long id;
  private long userId;
  private long vehicleId;
  private Date startDate;
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


  public Rent(long id, long userId, long vehicleId, Date startDate, Date endDate, int daysUsed, int distance, int dailyPrice, int distancePrice) {
    this.id = id;
    this.userId = userId;
    this.vehicleId = vehicleId;
    this.startDate = startDate;
    this.endDate = endDate;
    this.daysUsed = daysUsed;
    this.distance = distance;
    this.dailyPrice = dailyPrice;
    this.distancePrice = distancePrice;
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
}
