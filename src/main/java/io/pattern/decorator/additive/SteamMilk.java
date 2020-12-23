package io.pattern.decorator.additive;

import io.pattern.decorator.beverage.Beverage;

public class SteamMilk extends CondimentDecorator {
	Beverage beverage;

	public SteamMilk (Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 스팀밀크";
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
				cost += 100;
				break;
			case GRANDE:
				cost += 150;
				break;
			case VENTI:
				cost += 200;
				break;
		}
		return cost;
	}
}
