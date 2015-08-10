package org.formation.pattern.observer;

public class ConcreteObserver implements Observer {
	
	@Override
	public void update(int v) {
		System.out.println("The value is now " + v);
	}

}
