package io.pattern.strategy;

import io.pattern.strategy.behavior.FlyRocketPowered;
import io.pattern.strategy.client.Duck;
import io.pattern.strategy.client.MallardDuck;
import io.pattern.strategy.client.ModelDuck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiniDuckSimulatorTest {

	@Test
	public void mallardDuckTest(){
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		assertEquals("mallardDuck", mallard.getName());
	}

	@Test
	public void rocketDuckTest(){
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		assertEquals("modelDuck", model.getName());

	}
}
