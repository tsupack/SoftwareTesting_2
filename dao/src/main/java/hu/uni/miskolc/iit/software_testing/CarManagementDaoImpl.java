package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.dao.CarManagementDao;
import hu.uni.miskolc.iit.software_testing.exception.CarNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.Car;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CarManagementDaoImpl implements CarManagementDao {
  private File database;

  public CarManagementDaoImpl(File file) {
    this.database = file;
  }

  @Override
  public Car createCar(Car car) {
    throw new NotImplementedException();
  }

  @Override
  public Car getCarById(long id) throws CarNotFoundException {
    List<Car> cars = readDatabase();
    for(Car car : cars){
      if(car.getId() == id)
        return car;
    }
    throw new CarNotFoundException(("The requested car can not be found, ID:" + id));
  }

  @Override
  public Collection<Car> getCars() {
    return readDatabase();
  }

  @Override
  public void deleteCar(Car car) throws CarNotFoundException {
    throw new NotImplementedException();
  }

  @Override
  public boolean exists(Car car) {
    List<Car> cars = readDatabase();
    return cars.contains(car);
  }

  @Override
  public void clear() {
    throw new NotImplementedException();
  }

  private List<Car> readDatabase() {
    List<Car> result = new ArrayList<Car>();

    // TODO: Implement the database reading method, until then return with mocked data

    return result;
  }
}
