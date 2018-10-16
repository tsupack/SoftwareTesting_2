package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.dao.CarManagementDao;
import hu.uni.miskolc.iit.software_testing.exception.CarNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.Car;

import java.util.Collection;

public class CarManagementDaoImpl implements CarManagementDao {

  @Override
  public Car createCar(Car car) {
    return null;
  }

  @Override
  public Car getCarById(long id) throws CarNotFoundException {
    return null;
  }

  @Override
  public Collection<Car> getCars() {
    return null;
  }

  @Override
  public void deleteCar(Car car) throws CarNotFoundException {

  }

  @Override
  public boolean exists(Car car) {
    return false;
  }

  @Override
  public void clear() {

  }
}
