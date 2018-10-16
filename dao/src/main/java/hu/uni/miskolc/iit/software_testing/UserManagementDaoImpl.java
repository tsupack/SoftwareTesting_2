package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.dao.UserManagementDao;
import hu.uni.miskolc.iit.software_testing.exception.UserNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.User;

import java.util.Collection;

public class UserManagementDaoImpl implements UserManagementDao {

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
    return null;
  }

  @Override
  public void deleteUser(User user) throws UserNotFoundException {

  }

  @Override
  public boolean exists(User user) {
    return false;
  }

  @Override
  public void clear() {

  }
}
