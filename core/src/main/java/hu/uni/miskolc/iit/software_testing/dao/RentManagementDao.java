package hu.uni.miskolc.iit.software_testing.dao;

import hu.uni.miskolc.iit.software_testing.exception.RentNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.Rent;

import java.util.Collection;

public interface RentManagementDao {

  Rent createRent(Rent rent);

  Rent getRentById(long id) throws RentNotFoundException;

  Collection<Rent> getRents();

  void deleteRent(Rent rent) throws RentNotFoundException;

  boolean exists(Rent rent);

  void clear();
}
