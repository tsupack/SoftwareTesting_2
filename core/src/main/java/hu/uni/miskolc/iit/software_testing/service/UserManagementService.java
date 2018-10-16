package hu.uni.miskolc.iit.software_testing.service;

import hu.uni.miskolc.iit.software_testing.model.SearchUserRequest;
import hu.uni.miskolc.iit.software_testing.model.User;

import java.util.List;

public interface UserManagementService {

  /**
   * Returns a user searched by id
   *
   * @param id
   * @return User object
   */
  public User getUserById(int id);

  /**
   * Returns List of Users filtered by filter options
   *
   * @param searchUserRequest
   * @return List of User objects
   */
  public List<User> getUserByFilterOptions(SearchUserRequest searchUserRequest);

  /**
   * Returns a list with all of the User objects
   *
   * @return List of User objects
   */
  public List<User> getUsers();

  /**
   * Updates a User by given User object and returns the updated Object
   *
   * @param user
   * @return User object
   */
  public User updateUser(User user);

  /**
   * Deletes User given as parameter
   *
   * @param user
   */
  public void deleteUser(User user);
}
