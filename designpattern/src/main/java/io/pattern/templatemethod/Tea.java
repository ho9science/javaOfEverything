package io.pattern.templatemethod;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("get tea");
	}

	@Override
	void addCondiments() {
		System.out.println("add lemon");
	}
}
