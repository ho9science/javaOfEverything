package io.pattern.strategy.client;

import io.pattern.strategy.behavior.FlyNoWay;
import io.pattern.strategy.behavior.Quack;

public class ModelDuck extends Duck {
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
		name = "modelDuck";
	}

	public void display(){
		System.out.println("I'm model duck");
	}
}
