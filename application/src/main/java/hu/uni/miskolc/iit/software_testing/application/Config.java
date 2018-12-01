package main.java.hu.uni.miskolc.iit.software_testing.application;

import hu.uni.miskolc.iit.software_testing.*;
import hu.uni.miskolc.iit.software_testing.dao.RentManagementDao;
import hu.uni.miskolc.iit.software_testing.dao.UserManagementDao;
import hu.uni.miskolc.iit.software_testing.service.CarManagementService;
import hu.uni.miskolc.iit.software_testing.service.RentManagementService;
import hu.uni.miskolc.iit.software_testing.service.UserManagementService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;


@Configuration
public class Config {
  private static final String USER_DB_PATH = "userDBpath";
  private static final String VEHICLE_DB_PATH = "vehicleDBpath";
  private static final String RENT_DB_PATH = "rentDBpath";

  @Bean(value = "userManagementController")
  public UserManagementController getUserManagementController() {
    return new UserManagementController(getUserManagementService());
  }

  @Bean
  public UserManagementService getUserManagementService() {
    return new UserManagementServiceImpl(getUserManagementDao());
  }

  @Bean
  public UserManagementDao getUserManagementDao() {
    return new UserManagementDaoImpl(new File(System.getProperty(USER_DB_PATH)));
  }

  @Bean
  public VehicleController getCarController() {
    return new VehicleController(getCarManagementService());
  }

  @Bean
  public CarManagementService getCarManagementService() {
    return new CarManagementServiceImpl(getCarManagementDao());
  }

  @Bean
  public CarManagementDaoImpl getCarManagementDao() {
    return new CarManagementDaoImpl(new File(System.getProperty(VEHICLE_DB_PATH)));
  }

  @Bean
  public RentController getRentController() {
    return new RentController(getRentManagementService());
  }

  @Bean
  public RentManagementService getRentManagementService() {
    return new RentManagementServiceImpl(getRentManagementDao(), getUserManagementDao(), getCarManagementDao());
  }

  @Bean
  public RentManagementDao getRentManagementDao() {
    return new RentManagementDaoImpl(new File(System.getProperty(RENT_DB_PATH)));
  }
}