package by.htp.carparking.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import by.htp.carparking.entity.Car;
import by.htp.carparking.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	public CarService getCarService(){
		return carService;
	}
	
	public CarController(CarService carService){
		this.carService = carService;
	}
	
	
	public void setCarService(CarService carService){
		this.carService = carService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Car> cars() {

		return carService.getCars();

	}

}
