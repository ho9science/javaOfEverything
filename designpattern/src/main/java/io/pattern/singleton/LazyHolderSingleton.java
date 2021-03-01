package io.pattern.singleton;

/**
 * Lazy Initialization. LazyHolder
 * */
public class LazyHolderSingleton {
	private LazyHolderSingleton(){

	}

	private static class InnerLazyHolderSingleton{
		private static final LazyHolderSingleton uniqueInstance = new LazyHolderSingleton();
	}

	public static LazyHolderSingleton getInstance(){
		return InnerLazyHolderSingleton.uniqueInstance;
	}
}
