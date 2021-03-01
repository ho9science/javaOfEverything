package io.pattern.templatemethod;

public abstract class CaffeineBeverage {

	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater(){
		System.out.println("boil water");
	}

	void pourInCup(){
		System.out.println("pour in cup");
	}
}
