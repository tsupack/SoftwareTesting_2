package hu.uni.miskolc.iit.software_testing.model;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class SearchRentRequestTest {


    private SearchRentRequest request;

    @Before
    public void setUp() {
        Date startDate = new Date(61202516585000L);
        Date endDate = new Date(61202516585123L);
        this.request =new SearchRentRequest(123, startDate, endDate);
    }


    @Test
    public void getCarId() {
        int expected=123;
        int actual=request.getCarId();
        assertEquals(expected, actual);
    }

    @Test
    public void getStartDate() {
        Date expected= new Date(61202516585000L);
        Date actual=request.getStartDate();
        assertEquals(expected, actual);
    }

    @Test
    public void getEndDate() {
        Date expected= new Date(61202516585123L);
        Date actual=request.getEndDate();
        assertEquals(expected, actual);
    }
}