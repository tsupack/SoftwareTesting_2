package hu.uni.miskolc.iit.software_testing.dao;

import hu.uni.miskolc.iit.software_testing.exception.CarNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.Car;

import java.util.Collection;

public interface CarManagementDao {

  Car createCar(Car car);

  Car getCarById(long id) throws CarNotFoundException;

  Collection<Car> getCars();

  void deleteCar(Car car) throws CarNotFoundException;

  boolean exists(Car car);

  void clear();
}
