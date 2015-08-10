package org.formation.pattern.observer;

import java.util.Observable;

public class DataStore extends Observable {
	private String data = "";
	
	public String getData(){
		return this.data;
	}
	
	public void setData(String s){
		this.data = s;
		setChanged();
		notifyObservers(data);
	}
}
