package io.pattern.singleton;

/**
 * Lazy Initialization
 * */
public class BasicSingleton {
	private static BasicSingleton uniqueInstance;

	private BasicSingleton(){}

	public static synchronized BasicSingleton getInstance(){
		if (uniqueInstance == null){
			uniqueInstance = new BasicSingleton();
		}
		return uniqueInstance;
	}
}
