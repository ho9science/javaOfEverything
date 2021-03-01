package io.pattern.decorator.additive;

import io.pattern.decorator.beverage.Beverage;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy (Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 두유";
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
				cost += 200;
				break;
			case GRANDE:
				cost += 300;
				break;
			case VENTI:
				cost += 400;
				break;
		}
		return cost;
	}
}
