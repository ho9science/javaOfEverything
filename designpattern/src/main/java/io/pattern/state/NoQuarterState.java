package io.pattern.state;

public class NoQuarterState implements State {
	GumBallMachine gumBallMachine;

	public NoQuarterState(GumBallMachine gumBallMachine){
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("동전을 넣으셨습니다.");
		gumBallMachine.setState(gumBallMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("동전을 넣어주세요.");

	}

	@Override
	public void turnCrank() {
		System.out.println("동전을 넣어주세요.");

	}

	@Override
	public void dispense() {
		System.out.println("동전을 넣어주세요.");
	}
}
