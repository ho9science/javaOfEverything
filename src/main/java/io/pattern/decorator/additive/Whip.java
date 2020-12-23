package io.pattern.decorator.additive;

import io.pattern.decorator.beverage.Beverage;

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑크림";
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
				cost += 50;
				break;
			case GRANDE:
			case VENTI:
				cost += 100;
				break;
		}
		return cost;
	}
}
