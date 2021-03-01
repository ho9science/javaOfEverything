package io.pattern.strategy.client;

import io.pattern.strategy.behavior.FlyBehavior;
import io.pattern.strategy.behavior.QuackBehavior;
import lombok.Getter;

@Getter
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	String name;

	public Duck(){

	}

	public abstract void display();

	public void performFly(){
		flyBehavior.fly();
	}

	public void performQuack(){
		quackBehavior.quack();
	}

	public void swim(){
		System.out.println("duck of all can swim");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
	}
}
