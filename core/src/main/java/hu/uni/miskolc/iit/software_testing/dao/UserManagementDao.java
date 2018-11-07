package hu.uni.miskolc.iit.software_testing.dao;

import hu.uni.miskolc.iit.software_testing.exception.UserNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.User;

import java.util.Collection;

public interface UserManagementDao {

  User addUser(User user);

  User getUserById(long id) throws UserNotFoundException;

  Collection<User> getUsers();

  void deleteUser(User user) throws UserNotFoundException;

  boolean exists(User user);

  void clear();
}
