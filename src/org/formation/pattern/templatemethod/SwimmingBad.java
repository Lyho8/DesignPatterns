package org.formation.pattern.templatemethod;

public class SwimmingBad extends BreakingBadTemplate {

	@Override
	void haveACrappyLife() {
		// TODO Auto-generated method stub
		System.out.println("You live nearby seashore you poor bastard.");
	}

	@Override
	void getBadIdea() {
		// TODO Auto-generated method stub
		System.out.println("You decide to try and swim as far as you can.");
	}

	@Override
	void ideaTurnsBad() {
		// TODO Auto-generated method stub
		System.out.println("Congratulations, you've now reached the furthest point you are able to. Too bad that necessarily required your whole strength.");
	}

	@Override
	void getKilled() {
		// TODO Auto-generated method stub
		System.out.println("You're now sinking and drowning to death while your partner is laughing at you. *Bloob*");
	}

}
