package io.pattern.state;

public class WinnerState implements State{
	GumBallMachine gumBallMachine;

	public WinnerState(GumBallMachine gumBallMachine){
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("잠시만 기다려주세요. 알맹이가 나가고 있습니다.");
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
		System.out.println("축하드립니다! 알맹이를 하나 더 받으실 수 있습니다.");
		gumBallMachine.releaseBall();
		if(gumBallMachine.getCount() == 0){
			gumBallMachine.setState(gumBallMachine.getSoldOutState());
		}else {
			gumBallMachine.releaseBall();
			if(gumBallMachine.getCount() > 0){
				gumBallMachine.setState(gumBallMachine.getNoQuarterState());
			}else{
				System.out.println("더 이상 알맹이가 없습니다.");
				gumBallMachine.setState(gumBallMachine.getSoldOutState());
			}
		}
	}
}
