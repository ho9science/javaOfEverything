package io.pattern.templatemethod;

public class Coffee extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("brew coffee grind");
	}

	@Override
	void addCondiments() {
		System.out.println("add sugar and milk");
	}
}
