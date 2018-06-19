package by.htp.carparking.entity;

public class Car {
	
	private String brand;

	public Car(String brand) {
		super();
		this.brand = brand;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car brand: " + brand;
	}
}
