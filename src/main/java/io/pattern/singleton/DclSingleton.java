package io.pattern.singleton;

/**
 * Lazy Initialization. Double Checking Locking
 * */
public class DclSingleton {
	private volatile static DclSingleton uniqueInstance;

	private DclSingleton() {}

	public static DclSingleton getInstance(){
		if (uniqueInstance == null){
			synchronized (DclSingleton.class){
				if(uniqueInstance == null){
					uniqueInstance = new DclSingleton();
				}
			}
		}
	}
}
