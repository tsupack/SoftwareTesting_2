package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.exception.NegativeValueException;
import hu.uni.miskolc.iit.software_testing.model.Car;
import hu.uni.miskolc.iit.software_testing.model.SearchCarRequest;
import hu.uni.miskolc.iit.software_testing.service.CarManagementService;
import hu.uni.miskolc.iit.software_testing.exception.CarNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	private CarManagementService carManagementService;
	
	public VehicleController(CarManagementService carManagementService) {
		this.carManagementService = carManagementService;
	}

	@RequestMapping(value = "/getVehicle/{vehicleId}", method = RequestMethod.GET)
	public ResponseEntity<Car> getVehicleById(@PathVariable int id) throws CarNotFoundException {
		return ResponseEntity.ok(carManagementService.getCarById(id));
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<List<Car>> getCars() {
		List<Car> cars = carManagementService.getCars();
		return ResponseEntity.ok(cars);
	}

  @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
  public void removeVehicle(@RequestBody Car car) throws CarNotFoundException {
    carManagementService.removeCar(car);
  }
}
