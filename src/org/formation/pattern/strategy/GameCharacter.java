package org.formation.pattern.strategy;

public class GameCharacter {
	private MoveStrategy strat;
	
	public GameCharacter(){
		strat = new DefaultMove();
	}
	
	public void changeStrategy(MoveStrategy ms){
		this.strat = ms;
	}
	
	public void move(){
		strat.execute();
	}

}
