package hu.uni.miskolc.iit.software_testing.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {


    private User user;

    @Before
    public void setUp() {
        this.user = new User(2, "Anna", "user address", 87654321, 30, "849TS6654AD", UserType.USER);
    }

    @Test
    public void getId() {
        int expected = 2;
        int actual = user.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void getUserName() {
        String expected = "Anna";
        String actual = user.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void getAddress() {
        String expected = "user address";
        String actual = user.getAddress();
        assertEquals(expected, actual);
    }

    @Test
    public void getPhoneNumber() {
        long expected = 87654321;
        long actual = user.getPhoneNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void getAge() {
        int expected = 30;
        int actual = user.getAge();
        assertEquals(expected, actual);
    }

    @Test
    public void getDrivingLicenceNumber() {
        String expected = "849TS6654AD";
        String actual = user.getDrivingLicenceNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void getUserType() {
        UserType expected = UserType.USER;
        UserType actual = user.getUserType();
        assertEquals(expected, actual);
    }
}