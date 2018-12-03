package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.exception.CarNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.Car;
import hu.uni.miskolc.iit.software_testing.model.VehicleStatusType;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.util.Date;

import static org.junit.Assert.*;

public class CarManagementDaoImplTest {

    private Car car = new Car(123, "Mini_Cooper_S", "BMW", VehicleStatusType.FREE, 235, new Date(2014, 2, 2), 300, 4, "324 GSH", "AUT 0123456789");
    private File carDatabase;
    private CarManagementDaoImpl carManagementTest = new CarManagementDaoImpl(carDatabase);
    public ExpectedException thrown = ExpectedException.none();

    //@Test
    public void createCar() {
        assertEquals(true, carManagementTest.createCar(car));
    }

    //@Test
    public void getCarById() throws Exception {

        carManagementTest.createCar(car);
        assertEquals(car.getId(), carManagementTest.getCarById(car.getId()).getId());
    }

    //@Test
    public void getCars() {
            assertTrue(carManagementTest.getCars().size()==0);
    }

    //@Test
    public void deleteCarException() throws Exception {
        thrown.expect(CarNotFoundException.class);
        carManagementTest.deleteCar(car);
    }


    //@Test
    public void exists() {
        assertEquals(false, carManagementTest.exists(car));
    }

}
