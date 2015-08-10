package org.formation.pattern.templatemethod;

public abstract class BreakingBadTemplate {

	public final void breakBad(){
		haveACrappyLife();
		haveCancer();
		getBadIdea();
		findPartner();
		realizeBadIdea();
		ideaTurnsBad();
		getKilled();
	}
	
	abstract void haveACrappyLife();
	
	private void haveCancer(){
		System.out.println("You now have cancer.");
	}
	
	abstract void getBadIdea();
	
	private void findPartner(){
		System.out.println("You now have a partner supporting your terrible idea.");
	}
	
	private void realizeBadIdea(){
		System.out.println("You are now realizing your moronic project.");
	}
	
	abstract void ideaTurnsBad();
	
	abstract void getKilled();
	
	
	
}
