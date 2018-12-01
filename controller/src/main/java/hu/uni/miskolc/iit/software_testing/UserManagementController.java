package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.exception.UserNotFoundException;
import hu.uni.miskolc.iit.software_testing.exception.WrongUserIdFormatException;
import hu.uni.miskolc.iit.software_testing.model.SearchUserRequest;
import hu.uni.miskolc.iit.software_testing.model.User;
import hu.uni.miskolc.iit.software_testing.service.UserManagementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserManagementController {
  private UserManagementService userManagementService;

  public UserManagementController(UserManagementService userManagementService) {
    this.userManagementService = userManagementService;
  }

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public ResponseEntity<User> createUser(@RequestBody User newUser) throws WrongUserIdFormatException {
    return ResponseEntity.ok(userManagementService.createUser(newUser));
  }

  @RequestMapping(value = "/getAll", method = RequestMethod.GET)
  public ResponseEntity<List<User>> getAllUser() {
    return ResponseEntity.ok(userManagementService.getUsers());
  }

  @RequestMapping(value = "/update", method = RequestMethod.POST)
  public ResponseEntity<User> updateUser(@RequestBody User user) throws UserNotFoundException {
    User result = userManagementService.updateUser(user);
    return ResponseEntity.ok(result);
  }

  @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
  public void deleteUser(@RequestBody User user) throws UserNotFoundException {
    userManagementService.deleteUser(user);
  }

  @RequestMapping(value = "/getUser/{userId}", method = RequestMethod.GET)
  public ResponseEntity<User> getUserById(@PathVariable int id) throws UserNotFoundException{
    return ResponseEntity.ok(userManagementService.getUserById(id));
  }

  @RequestMapping(value = "/count", method = RequestMethod.GET)
  public ResponseEntity<Integer> getUserCount() {
    return ResponseEntity.ok(userManagementService.countUser());
  }
}
