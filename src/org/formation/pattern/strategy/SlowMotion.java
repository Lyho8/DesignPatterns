package org.formation.pattern.strategy;

public class SlowMotion implements MoveStrategy {

	@Override
	public void execute() {
		System.out.println("Youuuu're soooo slooooooow...");
	}
	
}
