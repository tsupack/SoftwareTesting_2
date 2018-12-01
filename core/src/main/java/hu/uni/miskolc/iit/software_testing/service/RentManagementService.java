package hu.uni.miskolc.iit.software_testing.service;

import com.sun.media.sound.InvalidDataException;
import hu.uni.miskolc.iit.software_testing.exception.RentAlreadyExistsException;
import hu.uni.miskolc.iit.software_testing.exception.RentNotFoundException;
import hu.uni.miskolc.iit.software_testing.exception.WrontRentDateException;
import hu.uni.miskolc.iit.software_testing.model.Rent;
import hu.uni.miskolc.iit.software_testing.model.SearchRentRequest;

import java.util.List;

public interface RentManagementService {

  /**
   * Adds a new rent and returns it
   *
   * @param rent
   * @return rent object
   */
  Rent addNewRent(Rent rent) throws RentAlreadyExistsException, WrontRentDateException, InvalidDataException;

  /**
   * Returns a Rent object by the given Id
   *
   * @param id
   * @return rent object
   */
  Rent getRentById(int id) throws RentNotFoundException;

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
  Rent updateRent(Rent rent) throws RentNotFoundException, WrontRentDateException, InvalidDataException;

  /**
   * Removes the given Rent object
   *
   * @param rent
   */
  void removeRent(Rent rent) throws RentNotFoundException, WrontRentDateException, InvalidDataException;
  /**
   * Returns the number of Rents
   *
   * @return Number of rents
   */
  int rentCount();

}
