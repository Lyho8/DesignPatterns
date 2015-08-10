package models;

public class CheapCar extends AbstractCar {
	public CheapCar(String brand, String model, int power){
		this.type = 1;
		this.brand = brand;
		this.model = model;
		this.power = power;
	}
}
