package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.dao.UserManagementDao;
import hu.uni.miskolc.iit.software_testing.exception.UserNotFoundException;
import hu.uni.miskolc.iit.software_testing.exception.WrongUserIdFormatException;
import hu.uni.miskolc.iit.software_testing.model.SearchUserRequest;
import hu.uni.miskolc.iit.software_testing.model.User;
import hu.uni.miskolc.iit.software_testing.service.UserManagementService;

import java.util.List;

public class UserManagementServiceImpl implements UserManagementService {
  private UserManagementDao userManagementDao;

  public UserManagementServiceImpl(UserManagementDao userManagementDao) {
    this.userManagementDao = userManagementDao;
  }

  @Override
  public User createUser(User user) throws WrongUserIdFormatException {

    if (user.getId() != 0) {
      User newUser = new User();
      if (user.getId() != 0){
        newUser.setId(user.getId());
      }
      newUser.setId(user.getId());
      newUser.setAge(user.getAge());
      newUser.setDrivingLicenceNumber(user.getDrivingLicenceNumber());
      newUser.setPhoneNumber(user.getPhoneNumber());
      newUser.setUserName(user.getUserName());
      newUser.setAddress(user.getAddress());
      return userManagementDao.addUser(newUser);
    } else {
      throw new WrongUserIdFormatException("User id is not identifiable");
    }
  }

  @Override
  public User getUserById(int id) throws UserNotFoundException {
    User result = userManagementDao.getUserById(id);
    if (result == null) {
      throw new UserNotFoundException("User can not be found with this id: " + id);
    } else {
      return result;
    }
  }

  @Override
  public List<User> getUserByFilterOptions(SearchUserRequest searchUserRequest) {
    return null;
  }

  @Override
  public List<User> getUsers() {
    return (List<User>) userManagementDao.getUsers();
  }

  @Override
  public User updateUser(User user) throws UserNotFoundException {
    User oldUser = userManagementDao.getUserById(user.getId());
      if (user.getId() != 0)
      {
        oldUser.setId(user.getId());
      }
      if (user.getAddress() != null && !user.getAddress().isEmpty())
      {
        oldUser.setAddress(user.getAddress());
      }
      if (user.getDrivingLicenceNumber() != null && !user.getDrivingLicenceNumber().isEmpty())
      {
        oldUser.setDrivingLicenceNumber(user.getDrivingLicenceNumber());
      }
      if (user.getPhoneNumber() != 0)
      {
        oldUser.setPhoneNumber(user.getPhoneNumber());
      }
      if (user.getUserName() != null && !user.getUserName().isEmpty())
      {
        oldUser.setUserName(user.getUserName());
      }
      return oldUser;
  }

  @Override
  public void deleteUser(User user) throws UserNotFoundException {
    if (userManagementDao.getUserById(user.getId()) == null)
    {
      throw new UserNotFoundException("User: " + user.toString() + "can not be found!");
    }
    userManagementDao.deleteUser(user);
  }

  @Override
  public int countUser() {
    return userManagementDao.getUsers().size();
  }
}
