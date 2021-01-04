package io.pattern.state;

import org.junit.Test;

public class GumballMachineTestDrive {

	@Test
	public void test(){
		GumBallMachine gumBallMachine = new GumBallMachine(5);

		System.out.println(gumBallMachine);

		gumBallMachine.insertQuarter();
		gumBallMachine.turnCrank();

		System.out.println(gumBallMachine);

		gumBallMachine.insertQuarter();
		gumBallMachine.turnCrank();
		gumBallMachine.insertQuarter();
		gumBallMachine.turnCrank();

		System.out.println(gumBallMachine);
	}
}
