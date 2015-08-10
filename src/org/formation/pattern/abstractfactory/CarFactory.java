package org.formation.pattern.abstractfactory;

import models.*;

public class CarFactory {
	private CarFactory(){}
	
	public static AbstractCar getCar(ICarFactory factory){
		return factory.getCar();
	}
}
