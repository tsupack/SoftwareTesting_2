package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.dao.CarManagementDao;
import hu.uni.miskolc.iit.software_testing.exception.CarNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.Car;
import hu.uni.miskolc.iit.software_testing.model.SearchCarRequest;
import hu.uni.miskolc.iit.software_testing.service.CarManagementService;

import java.util.List;

public class CarManagementServiceImpl implements CarManagementService {
  private CarManagementDao carManagementDao;

  public CarManagementServiceImpl(CarManagementDao carmanagementDao) {
    this.carManagementDao = carmanagementDao;
  }

  @Override
  public Car addNewCar(Car car) {
      Car newCar = carManagementDao.createCar(car);
      return newCar;
  }

  @Override
  public Car getCarById(int id) throws CarNotFoundException {
    return carManagementDao.getCarById(id);
  }

  @Override
  public List<Car> getCarByFilterOptions(SearchCarRequest searchCarRequest) {
    return null;
  }

  @Override
  public List<Car> getCars() {
    return (List<Car>)carManagementDao.getCars();
  }

  @Override
  public Car updateCar(Car car) throws CarNotFoundException {
    Car oldCar = getCarById(car.getId());
    oldCar.setPersonSeats(car.getPersonSeats());
    oldCar.setPlateNumber(car.getPlateNumber());
    oldCar.setRentCost(car.getRentCost());
    oldCar.setYearOfManufacture(car.getYearOfManufacture());
    oldCar.setPerformance(car.getPerformance());
    oldCar.setManufacturer(car.getManufacturer());
    oldCar.setType(car.getType());
    oldCar.setCarVIN(car.getCarVIN());
    oldCar.setId(car.getId());
    oldCar.setCarStatus(car.getCarStatus());

    return carManagementDao.createCar(oldCar);
  }

  @Override
  public void removeCar(Car car) throws CarNotFoundException {
    carManagementDao.deleteCar(car);
  }
}
