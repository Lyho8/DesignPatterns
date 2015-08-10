package org.formation.pattern.abstractfactory;

import models.AbstractCar;
import models.LuxuryCar;

public class LuxuryCarFactory implements ICarFactory{
	private String brand;
	private String model;
	private int enginePower;
	
	public LuxuryCarFactory(String brand, String model, int enginePower) {
		this.brand = brand;
		this.model = model;
		this.enginePower = enginePower+100;
	}

	@Override
	public AbstractCar getCar() {
		return new LuxuryCar(brand,model,enginePower);
	}

}

