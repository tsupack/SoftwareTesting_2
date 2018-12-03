package hu.uni.miskolc.iit.software_testing.model;
import hu.uni.miskolc.iit.software_testing.exception.InvalidArgumentsException;
import hu.uni.miskolc.iit.software_testing.exception.NotExistingUserTypeException;
import hu.uni.miskolc.iit.software_testing.exception.NegativeValueException;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.fail;

public class UserConstructorTest {
    private User user;
    private int id = 1;
    private String userName = "Béla";
    private String address = "Nincs";
    private long phoneNumber = 201234567;
    private int age = 55;
    private String drivingLicenceNumber = "ASD456ASD";

    @Before
    public void SetUp() throws InvalidArgumentsException
    {
        try
        {
            this.user = new User (this.id, this.userName, this.address, this.phoneNumber, this.age, this.drivingLicenceNumber, UserType.ADMIN);
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
            new User (this.id, this.userName, this.address, this.phoneNumber, this.age, this.drivingLicenceNumber, UserType.ADMIN);
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
            new User (-1, this.userName, this.address, this.phoneNumber, this.age, this.drivingLicenceNumber, UserType.ADMIN);
        }
        catch(Exception e)
        {
            throw new InvalidArgumentsException(e);
        }
    }

    @Test
    public void testConstructorWithNegativePhoneNumber() throws NegativeValueException
    {
        try
        {
            new User (this.id, this.userName, this.address, -1, this.age, this.drivingLicenceNumber, UserType.ADMIN);
        }
        catch(Exception e)
        {
            throw new NegativeValueException(e);
        }
    }

    @Test
    public void testConstructorWithNegativeAge() throws NegativeValueException
    {
        try
        {
            new User (this.id, this.userName, this.address, this.phoneNumber, -1, this.drivingLicenceNumber, UserType.ADMIN);
        }
        catch(Exception e)
        {
            throw new NegativeValueException(e);
        }
    }

    @Test
    public void testConstructorWithIllegalUserType() throws NotExistingUserTypeException
    {
        try
        {
            new User (this.id, this.userName, this.address, this.phoneNumber, this.age, this.drivingLicenceNumber, null);
        }
        catch(Exception e)
        {
            throw new NotExistingUserTypeException(e);
        }
    }
}
