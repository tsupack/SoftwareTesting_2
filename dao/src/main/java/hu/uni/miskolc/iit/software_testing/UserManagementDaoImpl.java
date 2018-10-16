package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.dao.UserManagementDao;
import hu.uni.miskolc.iit.software_testing.exception.UserNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.User;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserManagementDaoImpl implements UserManagementDao {
  private File database;

  public UserManagementDaoImpl(File file) {
    this.database = file;
  }

  @Override
  public User addUser(User user) {
    return null;
  }

  @Override
  public User getuserById(long id) throws UserNotFoundException {
    return null;
  }

  @Override
  public Collection<User> getUsers() {
    return readDatabase();
  }

  @Override
  public void deleteUser(User user) throws UserNotFoundException {

  }

  @Override
  public boolean exists(User user){
    List<User> users = readDatabase();
    return users.contains(user);
  }

  @Override
  public void clear() {

  }

  private List<User> readDatabase() {
    List<User> result = new ArrayList<User>();

    // TODO: Implement the database reading method, until then return with mocked data

    return result;
  }
}
