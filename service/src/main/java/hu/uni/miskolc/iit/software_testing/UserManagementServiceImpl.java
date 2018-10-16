package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.model.SearchUserRequest;
import hu.uni.miskolc.iit.software_testing.model.User;
import hu.uni.miskolc.iit.software_testing.service.UserManagementService;

import java.util.List;

public class UserManagementServiceImpl implements UserManagementService {
  @Override
  public User getUserById(int id) {
    return null;
  }

  @Override
  public List<User> getUserByFilterOptions(SearchUserRequest searchUserRequest) {
    return null;
  }

  @Override
  public List<User> getUsers() {
    return null;
  }

  @Override
  public User updateUser(User user) {
    return null;
  }

  @Override
  public void deleteUser(User user) {

  }
}
