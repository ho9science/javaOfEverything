package io.pattern.singleton;

/**
 * Eager Initialization
 * */
public class InitialSingleton {
	private static InitialSingleton uniqueInstance = new InitialSingleton();

	private InitialSingleton(){}

	public static InitialSingleton getInstance(){
		return uniqueInstance;
	}
}
