package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.dao.UserManagementDao;
import hu.uni.miskolc.iit.software_testing.exception.UserNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.User;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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

    throw new NotImplementedException();
  }

  @Override
  public User getuserById(long id) throws UserNotFoundException {
    List<User> users = readDatabase();
    for(User user : users){
      if(user.getId() == id)
        return user;
    }
    throw new UserNotFoundException("The requested user can not be found, ID: " + id);
  }

  @Override
  public Collection<User> getUsers() {
    return readDatabase();
  }

  @Override
  public void deleteUser(User user) throws UserNotFoundException {
    throw new NotImplementedException();
  }

  @Override
  public boolean exists(User user){
    List<User> users = readDatabase();
    return users.contains(user);
  }

  @Override
  public void clear() {
    throw new NotImplementedException();
  }

  private List<User> readDatabase() {
    List<User> result = new ArrayList<User>();

    // TODO: Implement the database reading method, until then return with mocked data

    return result;
  }
}
