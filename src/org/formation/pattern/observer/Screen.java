package org.formation.pattern.observer;

import java.util.Observable;

public class Screen implements java.util.Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Object " + o + " changed its value to " + arg + ".");
	}
}
