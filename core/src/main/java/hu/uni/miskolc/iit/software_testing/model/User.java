package hu.uni.miskolc.iit.software_testing.model;


public class User {
    /*
    TODO: id, userName, adress, phoneNumber
     */

  private long id;
  private String userName;
  private String address;
  private long phoneNumber;
  private int age;
  private String drivingLicenceNumber;
  private UserType userType;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public UserType getUserType() {
    return userType;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", userName='" + userName + '\'' +
            ", address='" + address + '\'' +
            ", phoneNumber=" + phoneNumber +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User other = (User) o;

    if (address == null && other.address != null) return false;
    if (!address.equals(other.address)) return false;
    if (drivingLicenceNumber == null && other.drivingLicenceNumber != null) return false;
    if (!drivingLicenceNumber.equals(other.drivingLicenceNumber)) return false;
    if (phoneNumber != other.phoneNumber) return false;
    if (id != other.id) return false;
    if (userName == null && other.userName != null) return false;
    if (!userName.equals(other.userName)) return false;
    return true;

  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
    result = prime * result + ((address == null) ? 0 : address.hashCode());
    result = prime * result + age;
    result = prime * result + ((userName == null) ? 0 : userName.hashCode());
    result = prime * result + ((drivingLicenceNumber == null) ? 0 : drivingLicenceNumber.hashCode());
    result = prime * result + (int)id;
    return result;
  }
}
