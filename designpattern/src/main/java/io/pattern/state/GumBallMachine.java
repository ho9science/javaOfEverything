package io.pattern.state;

import lombok.Getter;

@Getter
public class GumBallMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;

	State state = soldOutState;
	int count = 0;

	public GumBallMachine(int numberGumballs){
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		if (numberGumballs > 0){
			state = noQuarterState;
		}
	}

	public void insertQuarter(){
		state.insertQuarter();
	}

	public void ejectQuarter(){
		state.ejectQuarter();
	}

	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}

	public void dispense(){
		state.dispense();
	}

	void setState(State state){
		this.state = state;
	}

	void releaseBall(){
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0){
			count = count - 1;
		}
	}

	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\nmachine!!!");
		stringBuilder.append("\n남은 개수:"+count);
		stringBuilder.append("\n"+state);
		return stringBuilder.toString();
	}
}
