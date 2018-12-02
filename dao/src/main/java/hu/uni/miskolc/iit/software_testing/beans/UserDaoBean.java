package hu.uni.miskolc.iit.software_testing.beans;

import hu.uni.miskolc.iit.software_testing.model.User;
import hu.uni.miskolc.iit.software_testing.model.UserType;

public class UserDaoBean {
    private int id;
    private String userName;
    private String address;
    private long phoneNumber;
    private int age;
    private String drivingLicenceNumber;
    private UserType userType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }

    public void setDrivingLicenceNumber(String drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User other = (User) o;

        if (address == null && other.getAddress() != null) return false;
        if (!address.equals(other.getAddress())) return false;
        if (drivingLicenceNumber == null && other.getDrivingLicenceNumber() != null) return false;
        if (!drivingLicenceNumber.equals(other.getDrivingLicenceNumber())) return false;
        if (phoneNumber != other.getPhoneNumber()) return false;
        if (id != other.getId()) return false;
        if (userName == null && other.getUserName() != null) return false;
        if (!userName.equals(other.getUserName())) return false;
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
        result = prime * result + (int) id;
        return result;
    }

    @Override
    public String toString() {
        return "UserDaoBean{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", age=" + age +
                ", drivingLicenceNumber='" + drivingLicenceNumber + '\'' +
                ", userType=" + userType +
                '}';
    }

    public User extract() {
        User User = new User();
        User.setId(this.getId());
        User.setAge(this.getAge());
        User.setDrivingLicenceNumber(this.getDrivingLicenceNumber());
        User.setPhoneNumber(this.getPhoneNumber());
        User.setUserName(this.getUserName());
        User.setAddress(this.getAddress());
        User.setUserType(this.getUserType());

        return User;
    }
}
