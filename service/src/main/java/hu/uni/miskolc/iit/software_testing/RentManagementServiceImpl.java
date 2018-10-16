package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.model.Rent;
import hu.uni.miskolc.iit.software_testing.model.SearchRentRequest;
import hu.uni.miskolc.iit.software_testing.service.RentManagementService;

import java.util.List;

public class RentManagementServiceImpl implements RentManagementService {
  @Override
  public Rent addNewRent(Rent rent) {
    return null;
  }

  @Override
  public Rent getRentById(Long id) {
    return null;
  }

  @Override
  public List<Rent> getRentByFilterOptions(SearchRentRequest searchRentRequest) {
    return null;
  }

  @Override
  public List<Rent> getRents() {
    return null;
  }

  @Override
  public Rent updateRent(Rent rent) {
    return null;
  }

  @Override
  public void removeRent(Rent rent) {

  }

  @Override
  public int rentCount() {
    return 0;
  }
}
