package hu.uni.miskolc.iit.software_testing.model;

import java.util.Date;

public class SearchRentRequest {
  private int carId;
  private Date startDate;
  private Date endDate;

  public SearchRentRequest(int carId, Date startDate, Date endDate) {
    this.carId = carId;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public int getCarId() {
    return carId;
  }

  public void setCarId(int carId) {
    this.carId = carId;
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
}
