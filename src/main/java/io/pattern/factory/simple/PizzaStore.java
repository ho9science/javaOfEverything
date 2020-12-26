package io.pattern.factory.simple;

public class PizzaStore {
	SimplePizzaFactory simplePizzaFactory;

	public PizzaStore(SimplePizzaFactory factory){
		this.simplePizzaFactory = factory;
	}

	public Pizza orderPizza(String type){
		Pizza pizza;

		pizza = simplePizzaFactory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
