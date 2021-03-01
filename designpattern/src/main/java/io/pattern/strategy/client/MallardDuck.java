package io.pattern.strategy.client;

import io.pattern.strategy.behavior.FlyWithWings;
import io.pattern.strategy.behavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		name = "mallardDuck";
	}
	@Override
	public void display() {
		System.out.println("i'm mallardduck");
	}
}
