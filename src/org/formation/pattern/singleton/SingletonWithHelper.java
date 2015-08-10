package org.formation.pattern.singleton;

public class SingletonWithHelper {
	
	private SingletonWithHelper(){}
	
	private static class SingletonHolder{
		private static final SingletonWithHelper INSTANCE = new SingletonWithHelper();
	}
	
	public static SingletonWithHelper getInstance(){
		return SingletonHolder.INSTANCE;
	}
	
	public void singletonMethod(){
		System.out.println("I am " + this);
	}
}
