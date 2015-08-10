package org.formation.pattern.templatemethod;

public class BreakingBadOfficial extends BreakingBadTemplate {

	@Override
	void haveACrappyLife() {
		// TODO Auto-generated method stub
		System.out.println("You have a crippled son. You barely win anything from two unrewarding jobs while you helped creating a multi-billion dollars worth company. Your sex life is more or less dead.");
	}

	@Override
	void getBadIdea() {
		// TODO Auto-generated method stub
		System.out.println("You decide to produce and sell Methamphetamine.");
	}

	@Override
	void ideaTurnsBad() {
		// TODO Auto-generated method stub
		System.out.println("Surprinsingly, you have to deal with other dangerous dealers and end up being caught by the DEA. In the meantime, you lost the love of your family.");
	}

	@Override
	void getKilled() {
		// TODO Auto-generated method stub
		System.out.println("Your partner turns against you and put an end to your misery.");
	}

}
