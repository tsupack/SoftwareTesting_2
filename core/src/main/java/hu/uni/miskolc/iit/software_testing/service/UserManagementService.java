package hu.uni.miskolc.iit.software_testing.service;

import hu.uni.miskolc.iit.software_testing.exception.UserNotFoundException;
import hu.uni.miskolc.iit.software_testing.exception.WrongUserIdFormatException;
import hu.uni.miskolc.iit.software_testing.model.SearchUserRequest;
import hu.uni.miskolc.iit.software_testing.model.User;

import java.util.List;

public interface UserManagementService {

  /**
   * Records a new user object
   * @param user object
   * @return Created user object
   */
  public User createUser(User user) throws WrongUserIdFormatException;

  /**
   * Returns a user searched by id
   *
   * @param id
   * @return User object
   */
  public User getUserById(int id) throws UserNotFoundException;

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
  public User updateUser(User user) throws UserNotFoundException;

  /**
   * Deletes User given as parameter
   *
   * @param user
   */
  public void deleteUser(User user) throws UserNotFoundException;

  /**
   * Gives back the count of the users.
   * @return number of users
   */
  public int countUser();
}
