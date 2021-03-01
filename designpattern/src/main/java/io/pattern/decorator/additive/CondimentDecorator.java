package io.pattern.decorator.additive;

import io.pattern.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();

	public abstract Size getSize();
}
