package hu.uni.miskolc.iit.software_testing.model;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class SearchCarRequestTest {

    private SearchCarRequest request;
    @Before
    public void setUp() {
        this.request =new SearchCarRequest("BMW", new Date(2014, 02, 02), 50);
    }

    @Test
    public void getManufacturer() {
        String expected="BMW";
        String actual=request.getManufacturer();
        assertEquals(expected, actual);
    }

    @Test
    public void getYearOfManufacture() {
        Date expected=new Date(2014, 02, 02);
        Date actual=request.getYearOfManufacture();
        assertEquals(expected, actual);
    }

    @Test
    public void getRentCost() {
        double expected=50;
        double actual=request.getRentCost();
        assertEquals(expected, actual);
    }
}