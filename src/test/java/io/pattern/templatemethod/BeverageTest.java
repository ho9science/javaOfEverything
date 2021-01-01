package io.pattern.templatemethod;

import org.junit.Test;

public class BeverageTest {
	@Test
	public void test(){
		Tea tea = new Tea();
		tea.prepareRecipe();
	}

	@Test
	public void beverageWithHookTest(){
		CoffeeWithHook coffeeHook = new CoffeeWithHook();

		System.out.println("preparing coffee");
		coffeeHook.prepareRecipe();
	}
}
