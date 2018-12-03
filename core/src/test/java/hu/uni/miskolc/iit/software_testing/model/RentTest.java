package hu.uni.miskolc.iit.software_testing.model;

import hu.uni.miskolc.iit.software_testing.exception.InvalidArgumentsException;
import hu.uni.miskolc.iit.software_testing.exception.NegativeValueException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class RentTest {

    private Rent rent_Test;

    @Before
    public void setUp(){
        this.rent_Test= new Rent(1, 1, 123, new Date(2018, 12, 12), new Date(2018, 12, 17), 5, 200, 30, 10, true);
    }

    @Test
    public void isPaid() {
        boolean expected = true;
        boolean actual = rent_Test.isPaid();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getId() {
        long expected =1 ;
        long actual =rent_Test.getId() ;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUserId() {
        long expected = 1;
        long actual = rent_Test.getUserId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getVehicleId() {
        long expected = 123;
        long actual = rent_Test.getVehicleId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStartDate() {
        Date expected= new Date(2018, 12, 12);
        Date actual=rent_Test.getStartDate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEndDate() {
        Date expected= new Date(2018, 12, 17);
        Date actual=rent_Test.getEndDate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDaysUsed() {
        int expected = 5;
        int actual = rent_Test.getDaysUsed();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDistance() {
        int expected = 200;
        int actual = rent_Test.getDistance();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDailyPrice() {
        int expected = 30;
        int actual = rent_Test.getDailyPrice();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDistancePrice() {
        int expected = 10;
        int actual = rent_Test.getDistancePrice();
        Assert.assertEquals(expected, actual);
    }
}