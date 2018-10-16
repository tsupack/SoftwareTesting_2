package hu.uni.miskolc.iit.software_testing.service;

import hu.uni.miskolc.iit.software_testing.model.Car;
import hu.uni.miskolc.iit.software_testing.model.SearchCarRequest;

import java.util.List;

public interface CarManagementService {
    /*
    TODO: create interface for the Vehicle management service
     */

  /**
   * Creates a new car object
   *
   * @param car
   * @return Car object
   */
  Car addNewCar(Car car);

  /**
   * Returns with a Car object by the ID
   *
   * @param id
   * @return Car object
   */
  Car getCarById(int id);

  /**
   * Returns the list of cars filtered by options
   *
   * @param searchCarRequest filter options (manufacturer, year, price)
   * @return List of Car objects
   */
  List<Car> getCarByFilterOptions(SearchCarRequest searchCarRequest);

  /**
   * Returns the list of all cars
   *
   * @return List of Car object
   */
  List<Car> getCars();

  /**
   * Updates a car and returns the updated object
   *
   * @param car object
   * @return Car object
   */
  Car updateCar(Car car);

  /**
   * Deletes the car what is given as parameter
   *
   * @param car
   */
  void removeCar(Car car);
}
