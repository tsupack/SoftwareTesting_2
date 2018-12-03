package hu.uni.miskolc.iit.software_testing.model;
import hu.uni.miskolc.iit.software_testing.exception.InvalidArgumentsException;
import hu.uni.miskolc.iit.software_testing.exception.InvalidDateException;
import hu.uni.miskolc.iit.software_testing.exception.NegativeValueException;
import org.junit.Test;
import java.util.Date;
import org.junit.Before;
import static org.junit.Assert.fail;

public class RentConstructorTest {
    private Rent rent;
    private long id = 1;
    private long userId = 1;
    private long vehicleId = 1;
    private Date startDate = new Date(2018, 12, 12);
    private Date endDate = new Date(2018, 12, 17);
    private int daysUsed = 5;
    private int distance = 200;
    private int dailyPrice = 30;
    private int distancePrice = 10;
    private boolean isPaid = true;

    @Before
    public void SetUp() throws InvalidArgumentsException
    {
        try
        {
            this.rent = new Rent(this.id, this.userId, this.vehicleId, this.startDate, this.endDate, this.daysUsed, this.distance, this.dailyPrice, this.distancePrice, this.isPaid);
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
            new Rent(this.id, this.userId, this.vehicleId, this.startDate, this.endDate, this.daysUsed, this.distance, this.dailyPrice, this.distancePrice, this.isPaid);
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
            new Rent(-1, this.userId, this.vehicleId, this.startDate, this.endDate, this.daysUsed, this.distance, this.dailyPrice, this.distancePrice, this.isPaid);
        }
        catch(Exception e)
        {
            throw new InvalidArgumentsException(e);
        }
    }

    @Test
    public void testConstructorWithIllegalUserID() throws InvalidArgumentsException
    {
        try
        {
            new Rent(this.id, -1, this.vehicleId, this.startDate, this.endDate, this.daysUsed, this.distance, this.dailyPrice, this.distancePrice, this.isPaid);
        }
        catch(Exception e)
        {
            throw new InvalidArgumentsException(e);
        }
    }

    @Test
    public void testConstructorWithIllegalVehicleID() throws InvalidArgumentsException
    {
        try
        {
            new Rent(this.id, this.userId, -1, this.startDate, this.endDate, this.daysUsed, this.distance, this.dailyPrice, this.distancePrice, this.isPaid);
        }
        catch(Exception e)
        {
            throw new InvalidArgumentsException(e);
        }
    }

    @Test
    public void testConstructorWithNegativeDays() throws NegativeValueException
    {
        try
        {
            new Rent(this.id, this.userId, this.vehicleId, this.startDate, this.endDate, -1, this.distance, this.dailyPrice, this.distancePrice, this.isPaid);
        }
        catch(Exception e)
        {
            throw new NegativeValueException(e);
        }
    }

    @Test
    public void testConstructorWithNegativeDistance() throws NegativeValueException
    {
        try
        {
            new Rent(this.id, this.userId, this.vehicleId, this.startDate, this.endDate, this.daysUsed, -1, this.dailyPrice, this.distancePrice, this.isPaid);
        }
        catch(Exception e)
        {
            throw new NegativeValueException(e);
        }
    }

    @Test
    public void testConstructorWithNegativeDailyPrice() throws NegativeValueException
    {
        try
        {
            new Rent(this.id, this.userId, this.vehicleId, this.startDate, this.endDate, this.daysUsed, this.distance, -1, this.distancePrice, this.isPaid);
        }
        catch(Exception e)
        {
            throw new NegativeValueException(e);
        }
    }

    @Test
    public void testConstructorWithNegativeDistancePrice() throws NegativeValueException
    {
        try
        {
            new Rent(this.id, this.userId, this.vehicleId, this.startDate, this.endDate, this.daysUsed, this.distance, this.dailyPrice, -1, this.isPaid);
        }
        catch(Exception e)
        {
            throw new NegativeValueException(e);
        }
    }

    @Test
    public void testConstructorWithIllegalStartDate() throws InvalidDateException
    {
        try
        {
            this.rent = new Rent(this.id, this.userId, this.vehicleId, new Date(2,2,2), this.endDate, this.daysUsed, this.distance, this.dailyPrice, this.distancePrice, this.isPaid);
        }
        catch(Exception e)
        {
            throw new InvalidDateException(e);
        }
    }

    @Test
    public void testConstructorWithIllegalEndDate() throws InvalidDateException
    {
        try
        {
            this.rent = new Rent(this.id, this.userId, this.vehicleId, this.startDate, new Date(2,2,2), this.daysUsed, this.distance, this.dailyPrice, this.distancePrice, this.isPaid);
        }
        catch(Exception e)
        {
            throw new InvalidDateException(e);
        }
    }
}
