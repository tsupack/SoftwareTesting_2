package hu.uni.miskolc.iit.software_testing.model;
import hu.uni.miskolc.iit.software_testing.exception.InvalidArgumentsException;
import hu.uni.miskolc.iit.software_testing.exception.InvalidDateException;
import hu.uni.miskolc.iit.software_testing.exception.NegativeValueException;
import hu.uni.miskolc.iit.software_testing.exception.NotExistingVehicleStatusException;
import org.junit.Test;
import java.util.Date;
import org.junit.Before;
import static org.junit.Assert.fail;

public class CarConstructorTest {

    private Car car;
    private int id = 1;
    private String type = "Zafira";
    private String manufacturer = "Opel";
    private int performance = 116;
    private Date yearOfManufacture = new Date(2014,2,2);
    private double rentCost = 500;
    private int personSeats = 7;
    private String plateNumber = "MEM_123";
    private String carVIN = "ASDASDASD";

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
    public void testConstructorWithNegativePerformance() throws NegativeValueException
    {
        try
        {
            new Car(this.id, this.type, this.manufacturer, VehicleStatusType.RESERVED, -1, this.yearOfManufacture, this.rentCost, this.personSeats, this.plateNumber, this.carVIN);
        }
        catch(Exception e)
        {
            throw new NegativeValueException(e);
        }
    }

    @Test
    public void testConstructorWithNegativeRentCost() throws NegativeValueException
    {
        try
        {
            new Car(this.id, this.type, this.manufacturer, VehicleStatusType.RESERVED, this.performance, this.yearOfManufacture, -1, this.personSeats, this.plateNumber, this.carVIN);
        }
        catch(Exception e)
        {
            throw new NegativeValueException(e);
        }
    }

    @Test
    public void testConstructorWithNegativeSeats() throws NegativeValueException
    {
        try
        {
            new Car(this.id, this.type, this.manufacturer, VehicleStatusType.RESERVED, this.performance, this.yearOfManufacture, this.rentCost, -1, this.plateNumber, this.carVIN);
        }
        catch(Exception e)
        {
            throw new NegativeValueException(e);
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
