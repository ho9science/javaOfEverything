package io.pattern.decorator;

import io.pattern.decorator.additive.Mocha;
import io.pattern.decorator.additive.Soy;
import io.pattern.decorator.additive.Whip;
import io.pattern.decorator.beverage.Beverage;
import io.pattern.decorator.beverage.DarkRoast;
import io.pattern.decorator.beverage.Espresso;
import io.pattern.decorator.beverage.HouseBlend;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StarBuzzTest {

	@Test
	public void espressoTest(){
		Beverage beverage = new Espresso();
		assertEquals(3000.0, beverage.cost(), 0);
	}

	@Test
	public void darkRoatTest(){
		Beverage beverage = new DarkRoast();
		beverage.setSize(Beverage.Size.VENTI);
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		assertEquals(5600.0, beverage.cost(), 0);
	}

	@Test
	public void houseBlendTest(){
		Beverage beverage = new HouseBlend();
		beverage = new Soy(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		assertEquals("House Blend Coffee, 두유, 모카, 휘핑크림", beverage.getDescription());
	}
}
