package org.formation.pattern.singleton;

public class Singleton {
	
	private static Singleton instance = null;
	private int attr;
	
	private Singleton(){
		attr = 1;
	}
	
	public static Singleton getInstance(){
		if(instance==null){
			instance = new Singleton();
		}
		return instance;
	}
	
	public int getAttr() {
		return attr;
	}

	public void setAttr(int attr) {
		this.attr = attr;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Instance singleton, attr : " + attr;
	}

}
