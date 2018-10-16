package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.dao.RentManagementDao;
import hu.uni.miskolc.iit.software_testing.exception.RentNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.Rent;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RentManagementDaoImpl implements RentManagementDao {
  private File database;

  public RentManagementDaoImpl(File file) {
    this.database = file;
  }

  @Override
  public Rent createRent(Rent rent) {
    throw new NotImplementedException();
  }

  @Override
  public Rent getRentById(long id) throws RentNotFoundException {
    List<Rent> rents = readDatabase();
    for(Rent rent : rents){
      if(rent.getId() == id)
        return rent;
    }
    throw new RentNotFoundException("The requested rent can not be found, ID: " + id);
  }

  @Override
  public Collection<Rent> getRents() {
    return readDatabase();
  }

  @Override
  public void deleteRent(Rent rent) throws RentNotFoundException {
    throw new NotImplementedException();
  }

  @Override
  public boolean exists(Rent rent) {
    List<Rent> rents = readDatabase();
    return rents.contains(rent);
  }

  @Override
  public void clear() {
    throw new NotImplementedException();
  }

  private List<Rent> readDatabase() {
    List<Rent> result = new ArrayList<Rent>();

    // TODO: Implement the database reading method, until then return with mocked data

    return result;
  }
}
