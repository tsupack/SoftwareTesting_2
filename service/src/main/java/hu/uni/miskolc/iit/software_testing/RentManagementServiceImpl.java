package hu.uni.miskolc.iit.software_testing;

import com.sun.media.sound.InvalidDataException;
import hu.uni.miskolc.iit.software_testing.dao.CarManagementDao;
import hu.uni.miskolc.iit.software_testing.dao.RentManagementDao;
import hu.uni.miskolc.iit.software_testing.dao.UserManagementDao;
import hu.uni.miskolc.iit.software_testing.exception.RentAlreadyExistsException;
import hu.uni.miskolc.iit.software_testing.exception.RentNotFoundException;
import hu.uni.miskolc.iit.software_testing.exception.WrontRentDateException;
import hu.uni.miskolc.iit.software_testing.model.Rent;
import hu.uni.miskolc.iit.software_testing.model.SearchRentRequest;
import hu.uni.miskolc.iit.software_testing.service.RentManagementService;

import java.util.Date;
import java.util.List;

public class RentManagementServiceImpl implements RentManagementService {
  private RentManagementDao rentManagementDao;
  private UserManagementDao userManagementDao;
  private CarManagementDao carManagementDao;

  public RentManagementServiceImpl(RentManagementDao rentManagementDao, UserManagementDao userManagementDao, CarManagementDao carManagementDao) {
    this.rentManagementDao = rentManagementDao;
    this.userManagementDao = userManagementDao;
    this.carManagementDao = carManagementDao;
  }
  @Override
  public Rent addNewRent(Rent rent) throws RentAlreadyExistsException, WrontRentDateException, InvalidDataException {
      if(rentManagementDao.exists(rent)){
        throw new RentAlreadyExistsException(String.valueOf(rent.getId()));
      }
      validate(rent);
      Rent savedRent = rentManagementDao.createRent(rent);
      return savedRent;
  }

  @Override
  public Rent getRentById(int id) throws RentNotFoundException {
    return rentManagementDao.getRentById(id);
  }

  @Override
  public List<Rent> getRentByFilterOptions(SearchRentRequest searchRentRequest) {
    return null;
  }

  @Override
  public List<Rent> getRents() {
    return (List<Rent>) rentManagementDao.getRents();
  }

  @Override
  public Rent updateRent(Rent rent) throws RentNotFoundException, WrontRentDateException, InvalidDataException {
    if(!rentManagementDao.exists(rent)){
      throw new RentNotFoundException(String.valueOf(rent.getId()));
    }
    validate(rent);
    return rentManagementDao.createRent(rent);
  }

  @Override
  public void removeRent(Rent rent) throws RentNotFoundException, WrontRentDateException, InvalidDataException {
    if(!rentManagementDao.exists(rent)) {
      throw new RentNotFoundException(String.valueOf(rent.getId()));
    }
    validate(rent);
    this.rentManagementDao.deleteRent(rent);
  }

  @Override
  public int rentCount() {
    return Math.toIntExact(rentManagementDao.getRents().size());
  }

  private void validate(Rent rent) throws WrontRentDateException, InvalidDataException {
    String errorMsg = "";
    if(rent.getDailyPrice() < 0)
      errorMsg.concat(" , daily fee");
    if(rent.getDaysUsed() < 0)
      errorMsg.concat(" , days used");
    if(rent.getDistance() < 0)
      errorMsg.concat(" , distance");
    if(rent.getDistancePrice() < 0)
      errorMsg.concat(" , distance price");
    if(rent.getStartDate().after(rent.getEndDate()))
      throw new WrontRentDateException("Start date can't be before end date");
    if(errorMsg.length()>0){
      throw new InvalidDataException(errorMsg);
    }
  }
}
