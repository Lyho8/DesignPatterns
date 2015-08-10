package org.formation.pattern.strategy;

public class DefaultMove implements MoveStrategy {

	@Override
	public void execute() {
		System.out.println("Moving at normal speed.");
	}
	
}
