package io.pattern.factory.simple;

public class SimplePizzaFactory {
	public Pizza createPizza(String type){
		Pizza pizza = null;

		if("cheese".equals(type)){
			pizza = new CheesePizza();
		}
		return pizza;
	}
}
