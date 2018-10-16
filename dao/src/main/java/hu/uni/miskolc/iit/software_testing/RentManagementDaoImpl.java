package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.dao.RentManagementDao;
import hu.uni.miskolc.iit.software_testing.exception.RentNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.Rent;

import java.util.Collection;

public class RentManagementDaoImpl implements RentManagementDao {

  @Override
  public Rent createRent(Rent rent) {
    return null;
  }

  @Override
  public Rent getRentById(long id) throws RentNotFoundException {
    return null;
  }

  @Override
  public Collection<Rent> getRents() {
    return null;
  }

  @Override
  public void deleteRent(Rent rent) throws RentNotFoundException {

  }

  @Override
  public boolean exists(Rent rent) {
    return false;
  }

  @Override
  public void clear() {

  }
}
