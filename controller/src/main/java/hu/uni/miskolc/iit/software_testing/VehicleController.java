package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.model.Car;
import hu.uni.miskolc.iit.software_testing.CarManagementService;
import hu.uni.miskolc.iit.software_testing.exception.CarNotFoundException;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

public class VehicleController {
    /*
        TODO: Requestmappings for possible requests like getAll, getVehicle, etc...
     */
	
	private CarManagementService carmanagementservice;
	
	public VehicleController(CarManagementService carmanagementservice) {
		this.carmanagementservice = carmanagementservice;
	}
	
	@RequestMapping("/Cars")
	@ResponseBody
	public Collection<Car> listAllCars() throw CarNotFoundException{
		return carmanagementservice.getCars();
	}
	
	@RequestMapping("/Selected")
	@ResponseBody
	public Collection<Car> SelectedCars(@RequestParam(value = "year") int year) throw CarNotFoundException, NegativeValueException{
		return carmanagementservice.getCarByFilterOptions(year);
	}
	
	@RequestMapping("/ID")
	@ResponseBody
	public Collection<Car> SelectedID(@RequestParam(value = "ID") int ID) throw CarNotFoundException, NegativeValueException{
		return carmanagementservice.getCarById(ID);
	}
}
