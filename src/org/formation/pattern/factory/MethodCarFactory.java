package org.formation.pattern.factory;
import models.*;

public class MethodCarFactory {
	
	public static final int LUXURY = 0;
	public static final int CHEAP = 1;
	
	private MethodCarFactory(){}
	
	public static AbstractCar getCar(int type, String brand, String model, int power){
		switch(type){
		case LUXURY:
			return new LuxuryCar(brand, model, power);
		case CHEAP:
			return new CheapCar(brand, model, power);
		default:
			return null;
		
		}
	}
	
}
