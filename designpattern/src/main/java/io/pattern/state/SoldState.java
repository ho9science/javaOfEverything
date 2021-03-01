package io.pattern.state;

public class SoldState implements State {
	GumBallMachine gumBallMachine;

	public SoldState(GumBallMachine gumBallMachine){
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("잠시만 기다려주세요. 알맹이가 나가고 있습니다.");
		gumBallMachine.setState(gumBallMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("이미 알맹이를 뽑으셨습니");

	}

	@Override
	public void turnCrank() {
		System.out.println("손잡이는 한번만 돌려주세요.");

	}

	@Override
	public void dispense() {
		gumBallMachine.releaseBall();
		if(gumBallMachine.getCount() > 0){
			gumBallMachine.setState(gumBallMachine.getNoQuarterState());
		}else{
			System.out.println("품절!");
			gumBallMachine.setState(gumBallMachine.getSoldOutState());
		}
	}
}
