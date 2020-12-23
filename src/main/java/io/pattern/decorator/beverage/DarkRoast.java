package io.pattern.decorator.beverage;

public class DarkRoast extends Beverage {

	public DarkRoast(){
		description = "Dark Roast Coffee";
	}
	@Override
	public double cost() {
		return costAsSize();
	}

	private double costAsSize(){
		return 4500;
	}
}
