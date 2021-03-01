package io.pattern.decorator.additive;

import io.pattern.decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator {
	Beverage beverage;

	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}

	@Override
	public Size getSize() {
		return beverage.getSize();
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		switch(getSize()){
			case TALL:
				cost += 300;
				break;
			case GRANDE:
				cost += 400;
				break;
			case VENTI:
				cost += 500;
				break;
		}
		return cost;
	}
}
