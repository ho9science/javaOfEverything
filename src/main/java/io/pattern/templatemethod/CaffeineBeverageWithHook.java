package io.pattern.templatemethod;

public abstract class CaffeineBeverageWithHook {
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customWantsCondiments()){
			addCondiments();
		}
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater(){
		System.out.println("boil water");
	}

	void pourInCup(){
		System.out.println("pour in cup");
	}

	boolean customWantsCondiments(){
		return true;
	}
}
