package hu.uni.miskolc.iit.software_testing.service;

import hu.uni.miskolc.iit.software_testing.exception.RentAlreadyExistsException;
import hu.uni.miskolc.iit.software_testing.exception.WrontRentDateException;
import hu.uni.miskolc.iit.software_testing.model.Rent;
import hu.uni.miskolc.iit.software_testing.model.SearchRentRequest;

import java.util.List;

public interface RentManagementService {
  /*
  TODO: create interface skeleton for the Rent management service
   */

  /**
   * Adds a new rent and returns it
   *
   * @param rent
   * @return rent object
   */
  Rent addNewRent(Rent rent) throws RentAlreadyExistsException, WrontRentDateException;

  /**
   * Returns a Rent object by the given Id
   *
   * @param id
   * @return rent object
   */
  Rent getRentById(Long id);

  /**
   * Returns a list of Rent objects by given filter options
   *
   * @param searchRentRequest
   * @return List of Rent objects
   */
  List<Rent> getRentByFilterOptions(SearchRentRequest searchRentRequest);

  /**
   * Returns a List of Rent objects with all Rent in it.
   *
   * @return
   */
  List<Rent> getRents();

  /**
   * Updates a Rent object with the given Rent and returns it.
   *
   * @param rent
   * @return Rent object
   */
  Rent updateRent(Rent rent);

  /**
   * Removes the given Rent object
   *
   * @param rent
   */
  void removeRent(Rent rent);

  /**
   * Returns the number of Rents
   *
   * @return Number of rents
   */
  int rentCount();


}
