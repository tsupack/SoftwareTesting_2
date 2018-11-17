package hu.uni.miskolc.iit.software_testing;

import com.fasterxml.jackson.databind.ObjectMapper;
import hu.uni.miskolc.iit.software_testing.beans.CarDaoBean;
import hu.uni.miskolc.iit.software_testing.dao.CarManagementDao;
import hu.uni.miskolc.iit.software_testing.exception.CarNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.Car;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

  private List<Car> readDatabase(){
    List<Car> result = new ArrayList<Car>();
    ObjectMapper mapper = new ObjectMapper();
    try {
      List<CarDaoBean> beans = Arrays.asList(mapper.readValue(database, CarDaoBean[].class));
      for (CarDaoBean bean : beans)
      {
        result.add(bean.extract());
      }
    } catch (IOException e) {
      System.out.println(database.getAbsolutePath());
      e.printStackTrace();
    }
    return result;
  }

  private void writeDatabase(List<Car> Cars)
  {
    List<CarDaoBean> beans = new ArrayList<CarDaoBean>();
    for (Car Car : Cars){
      beans.add(convert(Car));
    }

    ObjectMapper mapper = new ObjectMapper();
    try {
      mapper.writeValue(database, beans);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private CarDaoBean convert(Car car)
  {
    CarDaoBean bean = new CarDaoBean();
      bean.setId(car.getId());
      bean.setPlateNumber(car.getPlateNumber());
      bean.setCarVIN(car.getCarVIN());
      bean.setType(car.getType());
      bean.setManufacturer(car.getManufacturer());
      bean.setYearOfManufacture(car.getYearOfManufacture());
      bean.setRentCost(car.getRentCost());
      bean.setPersonSeats(car.getPersonSeats());
      bean.setPerformance(car.getPerformance());
      bean.setCarStatus(car.getCarStatus());
    return bean;
  }
}
