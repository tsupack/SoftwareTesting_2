package hu.uni.miskolc.iit.software_testing.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchUserRequestTest {



    private SearchUserRequest request;

    @Before
    public void setUp() {
        this.request =new SearchUserRequest("Anna", "12346578", "address", "AD12358SF12");
    }


    @Test
    public void getUserName() {
        String expected="Anna";
        String actual=request.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void getPhoneNumber() {
        String expected="12346578";
        String actual=request.getPhoneNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void getAddress() {
        String expected="12346578";
        String actual=request.getPhoneNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void getDrivingLicenceNumber() {
        String expected="AD12358SF12";
        String actual=request.getDrivingLicenceNumber();
        assertEquals(expected, actual);
    }
}