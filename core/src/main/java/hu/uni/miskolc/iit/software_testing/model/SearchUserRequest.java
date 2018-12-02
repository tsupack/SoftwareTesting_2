package hu.uni.miskolc.iit.software_testing.model;

public class SearchUserRequest {
  private String userName;
  private String phoneNumber;
  private String address;
  private String drivingLicenceNumber;

  public SearchUserRequest(String userName, String phoneNumber, String address, String drivingLicenceNumber) {
    this.userName = userName;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.drivingLicenceNumber = drivingLicenceNumber;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getDrivingLicenceNumber() {
    return drivingLicenceNumber;
  }

  public void setDrivingLicenceNumber(String drivingLicenceNumber) {
    this.drivingLicenceNumber = drivingLicenceNumber;
  }
}
