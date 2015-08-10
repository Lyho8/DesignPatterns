package org.formation.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private int value;
	
	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer o: observers){
			o.update(value);
		}
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int v){
		this.value = v;
		notifyObservers();
	}
}
