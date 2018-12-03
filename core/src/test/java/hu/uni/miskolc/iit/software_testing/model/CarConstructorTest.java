package hu.uni.miskolc.iit.software_testing.model;
import hu.uni.miskolc.iit.software_testing.exception.InvalidArgumentsException;
import hu.uni.miskolc.iit.software_testing.exception.InvalidDateException;
import hu.uni.miskolc.iit.software_testing.exception.NotExistingVehicleStatusException;
import org.junit.Test;
import java.util.Date;
import org.junit.Before;
import static org.junit.Assert.fail;

public class CarConstructorTest {

    Car car;
    int id=1;
    String type="Zafira";
    String manufacturer="Opel";

    int performance=116;
    Date yearOfManufacture=new Date(2014,2,2);
    double rentCost=500;
    int personSeats=7;
    String plateNumber="MEM_123";
    String carVIN="ASDASDASD";

    @Before
    public void SetUp() throws InvalidArgumentsException
    {
        try
        {
            this.car = new Car(this.id, this.type, this.manufacturer, VehicleStatusType.RESERVED, this.performance, this.yearOfManufacture, this.rentCost, this.personSeats, this.plateNumber, this.carVIN);
        }
        catch(Exception e)
        {
            throw new InvalidArgumentsException(e);
        }
    }

    @Test
    public void testConstructorWithLegalValues()
    {
        try
        {
            new Car(this.id, this.type, this.manufacturer, VehicleStatusType.RESERVED, this.performance, this.yearOfManufacture, this.rentCost, this.personSeats, this.plateNumber, this.carVIN);
        }
        catch(Exception e)
        {
            fail(e.getMessage());
        }
    }

    @Test
    public void testConstructorWithIllegalID() throws InvalidArgumentsException
    {
        try
        {
            new Car(-1, this.type, this.manufacturer, VehicleStatusType.RESERVED, this.performance, this.yearOfManufacture, this.rentCost, this.personSeats, this.plateNumber, this.carVIN);
        }
        catch(Exception e)
        {
            throw new InvalidArgumentsException(e);
        }
    }

    @Test
    public void testConstructorWithIllegalCarStatus() throws NotExistingVehicleStatusException
    {
        try
        {
            new Car(this.id, this.type, this.manufacturer, null, this.performance, this.yearOfManufacture, this.rentCost, this.personSeats, this.plateNumber, this.carVIN);
        }
        catch(Exception e)
        {
            throw new NotExistingVehicleStatusException(e);
        }
    }

    @Test
    public void testConstructorWithIllegalDate() throws InvalidDateException
    {
        try
        {
            new Car(this.id, this.type, this.manufacturer, VehicleStatusType.RESERVED, this.performance, new Date(2,2,2), this.rentCost, this.personSeats, this.plateNumber, this.carVIN);
        }
        catch(Exception e)
        {
            throw new InvalidDateException(e);
        }
    }
}
