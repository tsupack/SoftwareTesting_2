package hu.uni.miskolc.iit.software_testing.model;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class SearchRentRequestTest {


    private SearchRentRequest request;

    @Before
    public void setUp() {
        this.request =new SearchRentRequest(123, new Date(2018, 12, 12), new Date(2018, 12, 19));
    }


    @Test
    public void getCarId() {
        int expected=123;
        int actual=request.getCarId();
        assertEquals(expected, actual);
    }

    @Test
    public void getStartDate() {
        Date expected= new Date(2018, 12, 12);
        Date actual=request.getStartDate();
        assertEquals(expected, actual);
    }

    @Test
    public void getEndDate() {
        Date expected= new Date(2018, 12, 19);
        Date actual=request.getStartDate();
        assertEquals(expected, actual);
    }
}