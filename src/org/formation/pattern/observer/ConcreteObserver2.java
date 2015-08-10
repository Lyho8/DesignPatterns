package org.formation.pattern.observer;

public class ConcreteObserver2 implements Observer {

	@Override
	public void update(int v) {
		System.out.println("La valeur est maintenant " + v);
	}

}
