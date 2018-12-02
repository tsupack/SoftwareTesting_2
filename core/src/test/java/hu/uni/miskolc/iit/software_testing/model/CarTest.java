package hu.uni.miskolc.iit.software_testing.model;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class CarTest {


    private Car Car_Test;
    @Before
    public void setUp() {
        this.Car_Test =new Car(123, "Mini_Cooper_S", "BMW", VehicleStatusType.FREE, 235, new Date(2014, 02, 02), 300, 4, "324 GSH", "AUT 0123456789");
    }


    @Test
    public void getPlateNumber() {
        String expected="324 GSH";
        String actual=Car_Test.getPlateNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void getCarVIN() {
        String expected="AUT 0123456789";
        String actual=Car_Test.getCarVIN();
        assertEquals(expected, actual);
    }

    @Test
    public void getId() {
        int expected=123;
        int actual=Car_Test.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void getType() {
        String expected="Mini_Cooper_S";
        String actual=Car_Test.getType();
        assertEquals(expected, actual);
    }

    @Test
    public void getManufacturer() {
        String expected="BMW";
        String actual=Car_Test.getManufacturer();
        assertEquals(expected, actual);
    }

    @Test
    public void getCarStatus() {
        assertEquals( VehicleStatusType.FREE, Car_Test.getCarStatus());
    }

    @Test
    public void getPerformance() {
        int expected=235;
        int actual=Car_Test.getPerformance();
        assertEquals(expected, actual);
    }

    @Test
    public void getYearOfManufacture() {
        Date expected=new Date(2014, 02, 02);
        Date actual=Car_Test.getYearOfManufacture();
        assertEquals(expected, actual);
    }

    @Test
    public void getRentCost() {
        double expected=300;
        double actual=Car_Test.getRentCost();
        assertEquals(expected, actual);
    }

    @Test
    public void getPersonSeats() {
        int expected=4;
        int actual=Car_Test.getPersonSeats();
        assertEquals(expected, actual);
    }
}