package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.dao.CarManagementDao;
import hu.uni.miskolc.iit.software_testing.dao.RentManagementDao;
import hu.uni.miskolc.iit.software_testing.dao.UserManagementDao;
import hu.uni.miskolc.iit.software_testing.exception.UserNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.Car;
import hu.uni.miskolc.iit.software_testing.model.Rent;
import hu.uni.miskolc.iit.software_testing.model.User;
import hu.uni.miskolc.iit.software_testing.service.RentManagementService;
import org.junit.Before;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.easymock.EasyMock.*;

public class RentManagementServiceImpTest {

  private RentManagementService rentManagementService;
  private RentManagementDao rentManagementDao;
  private UserManagementDao userManagementDao;
  private CarManagementDao carManagementDao;

  private Rent rentObject;
  private Rent otherRentObject;
  private Rent rentAfterUpdate;

  private Car car;
  private User user;

  @Before
  public void setUp() throws Exception{
    rentManagementDao = mock(rentManagementDao.getClass());
    rentManagementService = mock(rentManagementService.getClass());
    carManagementDao = mock(carManagementDao.getClass());
    userManagementDao = mock(userManagementDao.getClass());

    Date startDate = null;
    Date endDate = null;
    Date anotherStartDate = null;
    Date anotherEndDate = null;

    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    try {
      startDate = format.parse("2017-02-01");
      endDate = format.parse("2017-03-01");
      anotherStartDate = format.parse("2017-05-01");
      anotherEndDate = format.parse("2017-06-01");
    } catch (ParseException e) {
      e.printStackTrace();
    }




    rentObject = new Rent(
            1L,
            1L,
            1L,
            startDate,
            endDate,
            24,
            100,
            15000,
            1000,
            false

    );

    otherRentObject = new Rent(
            2L,
            0L,
            2L,
            anotherStartDate,
            anotherEndDate,
            2,
            200,
            20000,
            1500,
            true

    );


    car = new Car();

    car.setCareIdNumber("ID227375");
    car.setId(1L);
    car.setType("Car");
    car.setManufacturer("Fiat");
    car.setCarStatus("Free");
    car.setPerformance(100);
    car.setYearOfManufacture(new Date());
    car.setRentCost(200);
    car.setPersonSeats(4);
    car.setPlateNumber("IJK-256");

    user = new User();
    user.setId(1L);
    user.setUserName("testUser");
    user.setAddress("testAdress");
    user.setPhoneNumber(123456789);

  }

  @Test
  public void getRentById() throws Exception{
    expect(rentManagementDao.getRentById(1L)).andReturn(rentObject);

    replay(rentManagementDao);

    Rent actual = rentManagementService.getRentById(1L);
    expect(actual).equals(rentObject);
  }

  @Test
  public void addNewRent() throws Exception{
    expect(rentManagementDao.createRent(anyObject(Rent.class))).andReturn(rentObject);
    expect(rentManagementDao.exists(anyObject(Rent.class))).andReturn(false);
    replay(rentManagementDao);

    expect(userManagementDao.getuserById(anyLong())).andReturn(user).anyTimes();
    replay(userManagementDao);

    expect(carManagementDao.getCarById(anyLong())).andReturn(car);
    replay(carManagementDao);

    Rent actual = rentManagementService.addNewRent((rentObject));
    expect(rentObject).equals(actual);
  }

  @Test
  public void getRentByFilterOptions() throws Exception{
    TODO:
    throw new NotImplementedException();
  }

  @Test
  public void getRents() throws Exception{
    List<Rent> expected = new ArrayList<>();
    expected.add(rentObject);
    expected.add(otherRentObject);
    expect(rentManagementDao.getRents()).andReturn(expected);

    replay(rentManagementDao);

    List<Rent> actual = rentManagementService.getRents();
    expect(actual).equals(expected);
  }

  @Test
  public void updateRent() throws Exception{
    TODO:
      throw new NotImplementedException();
  }

  @Test
  public void removeRent() throws Exception{
    TODO:
    throw new NotImplementedException();
  }

  @Test(expected = UserNotFoundException.class)
  public void userNotFoundException() throws Exception{
    TODO:
    throw new NotImplementedException();
  }

}
