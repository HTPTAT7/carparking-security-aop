package by.htp.carparking.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import by.htp.carparking.entity.Car;
import by.htp.carparking.service.CarService;

@Component
public class CarServiceImpl implements CarService {

	@Override
	public List<Car> getCars() {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("BMW"));
		cars.add(new Car("VW"));
		cars.add(new Car("Audi"));
		
		return cars;
	}

}
