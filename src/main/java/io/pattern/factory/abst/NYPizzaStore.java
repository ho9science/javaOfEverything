package io.pattern.factory.abst;


public class NYPizzaStore extends PizzaStore {
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;

		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		if("cheese".equals(type)){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("NEW YORK Style Cheese Pizza");
		}else if ("veggie".equals(type)){
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("NEW YORK Style Veggie Pizza");
		}else if ("clam".equals(type)){
			pizza = new ClamPizza((ingredientFactory));
			pizza.setName("NEW YORK Style Clam Pizza");
		}else if ("pepperoni".equals(type)){
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("NEW YORK Style Pepperoni Pizza");
		}
		return pizza;
	}
}
