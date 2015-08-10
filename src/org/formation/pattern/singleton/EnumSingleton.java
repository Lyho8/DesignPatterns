package org.formation.pattern.singleton;

public enum EnumSingleton {
	INSTANCE;
	
	public void singletonMethod(){
		System.out.println("I am the only one ! " + INSTANCE);
	}
}
