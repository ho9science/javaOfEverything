package io.pattern.factory.method;

import org.junit.Test;

public class PizzaDriveTest {
	@Test
	public void driveThroughTest(){
		PizzaStore nyStore = new NYPizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("henry ordered a " + pizza.getName() +"\n");
	}

	@Test
	public void phoneCallTest(){
		PizzaStore chicacoStore = new ChicagoPizzaStore();
		Pizza pizza = chicacoStore.orderPizza("cheese");
		System.out.println("henry ordered a "+ pizza.getName()+"\n");
	}
}
