package hu.uni.miskolc.iit.software_testing;

import com.fasterxml.jackson.databind.ObjectMapper;
import hu.uni.miskolc.iit.software_testing.beans.RentDaoBean;
import hu.uni.miskolc.iit.software_testing.dao.RentManagementDao;
import hu.uni.miskolc.iit.software_testing.exception.RentNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.Rent;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class RentManagementDaoImpl implements RentManagementDao {
  private File database;

  public RentManagementDaoImpl(File file) {
    this.database = file;
  }

  @Override
  public Rent createRent(Rent rent) {
    boolean exist = false;
    List<Rent> rents = readDatabase();
    if (rents.size() != 0){
      for (Rent r : rents)
      {
        if (r.getId() == rent.getId())
        {
          exist = true;
          r.setUserId(rent.getUserId());
          r.setVehicleId(rent.getVehicleId());
          r.setStartDate(rent.getStartDate());
          r.setEndDate(rent.getEndDate());
          r.setDistance(rent.getDistance());
          r.setDailyPrice(rent.getDailyPrice());
          r.setDistancePrice(rent.getDistancePrice());
          r.setPaid(rent.isPaid());
        }
      }
    }
    if (!exist)
    {
      rents.add(rent);
    }

    writeDatabase(rents);
    return rent;

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
    List<Rent> rents = readDatabase();
    rents.remove(rent);
    writeDatabase(rents);
  }

  @Override
  public boolean exists(Rent rent) {
    List<Rent> rents = readDatabase();
    for(Rent rentItem : rents){
      if(rentItem.getId() == rent.getId())
        return true;
    }
    return false;
  }

  @Override
  public void clear() {
    writeDatabase(new ArrayList<Rent>());
  }

  private List<Rent> readDatabase(){
    List<Rent> result = new ArrayList<>();
    ObjectMapper mapper = new ObjectMapper();
    try {
      List<RentDaoBean> beans = Arrays.asList(mapper.readValue(database, RentDaoBean[].class));
      for (RentDaoBean bean : beans)
      {
        result.add(bean.extract());
      }
    } catch (IOException e) {
      System.out.println(database.getAbsolutePath());
      e.printStackTrace();
    }
    return result;
  }

  private void writeDatabase(List<Rent> rents)
  {
    List<RentDaoBean> beans = new ArrayList<>();
    for (Rent rent : rents){
      beans.add(convert(rent));
    }

    ObjectMapper mapper = new ObjectMapper();
    try {
      mapper.writeValue(database, beans);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private RentDaoBean convert(Rent rent)
  {
    RentDaoBean bean = new RentDaoBean();
    bean.setId(rent.getId());
    bean.setUserId(rent.getUserId());
    bean.setVehicleId(rent.getVehicleId());
    bean.setStartDate(rent.getStartDate());
    bean.setEndDate(rent.getEndDate());
    bean.setDistance(rent.getDistance());
    bean.setDailyPrice(rent.getDailyPrice());
    bean.setDistancePrice(rent.getDistancePrice());
    bean.setPaid(rent.isPaid());

    return bean;
  }
}
