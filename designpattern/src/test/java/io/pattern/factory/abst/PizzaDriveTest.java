package io.pattern.factory.abst;

import org.junit.Test;

public class PizzaDriveTest {
	@Test
	public void coupangEatsTest() {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println("henry ordered a " + pizza.getName() +"\n");
	}
}
