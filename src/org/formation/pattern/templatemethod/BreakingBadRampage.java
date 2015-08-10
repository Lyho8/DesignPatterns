package org.formation.pattern.templatemethod;

public class BreakingBadRampage extends BreakingBadTemplate {

	@Override
	void haveACrappyLife() {
		// TODO Auto-generated method stub
		System.out.println("You are a sociopath.");
	}

	@Override
	void getBadIdea() {
		// TODO Auto-generated method stub
		System.out.println("You decide to get revenge on your doctor and to kill as many people as possile before dying. You convince a friend to help you in your rampage.");
	}

	@Override
	void ideaTurnsBad() {
		// TODO Auto-generated method stub
		System.out.println("Your friend turns out to be a complete psychopath and brought dozens of hand grenades.");
	}

	@Override
	void getKilled() {
		// TODO Auto-generated method stub
		System.out.println("You and your friend end up blowing yourselves up with your own grenades, you didn't manage to kill anyone else.");
	}

}
