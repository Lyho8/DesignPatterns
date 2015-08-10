package org.formation.pattern.abstractfactory;

import models.*;

public class CheapCarFactory implements ICarFactory{
	private String brand;
	private String model;
	private int enginePower;
	
	public CheapCarFactory(String brand, String model, int enginePower) {
		this.brand = brand;
		this.model = model;
		this.enginePower = enginePower-100;
	}

	@Override
	public AbstractCar getCar() {
		return new CheapCar(brand,model,enginePower);
	}

}
