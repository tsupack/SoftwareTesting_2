package hu.uni.miskolc.iit.software_testing;

import com.sun.media.sound.InvalidDataException;
import hu.uni.miskolc.iit.software_testing.exception.*;
import hu.uni.miskolc.iit.software_testing.model.Rent;
import hu.uni.miskolc.iit.software_testing.service.RentManagementService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rent")
public class RentController {
  private RentManagementService rentManagementService;

  public RentController(RentManagementService rentManagementService) {
    this.rentManagementService = rentManagementService;
  }

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public ResponseEntity<Rent> createRent(@RequestBody Rent rent) throws InvalidDataException, WrontRentDateException, RentAlreadyExistsException {
    return ResponseEntity.ok(rentManagementService.addNewRent(rent));
  }

  @RequestMapping(value = "/getById", method = RequestMethod.POST)
  public ResponseEntity<Rent> getRentById(@RequestBody int id) throws RentNotFoundException {
    return ResponseEntity.ok(rentManagementService.getRentById(id));
  }

  @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<Rent>> getAllRent(){
    return ResponseEntity.ok(rentManagementService.getRents());
  }

  @RequestMapping(value = "/update", method = RequestMethod.POST)
  public ResponseEntity<Rent> updateRent(@RequestBody Rent rent) throws InvalidDataException, WrontRentDateException, RentNotFoundException {
    Rent result = rentManagementService.updateRent(rent);
    return ResponseEntity.ok(result);
  }

  @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
  public void deleteRent(@RequestBody Rent rent) throws InvalidDataException, WrontRentDateException, RentNotFoundException {
    rentManagementService.removeRent(rent);
  }

  @RequestMapping(value = "/count", method = RequestMethod.GET)
  public ResponseEntity<Integer> getRentCount(){
    return ResponseEntity.ok(rentManagementService.rentCount());
  }
}
