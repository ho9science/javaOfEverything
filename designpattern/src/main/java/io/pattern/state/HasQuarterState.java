package io.pattern.state;

import java.util.Random;

public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	GumBallMachine gumBallMachine;

	public HasQuarterState(GumBallMachine gumBallMachine){
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("동전은 한개만 넣어주세요.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("동전이 반환됩니다.");
		gumBallMachine.setState(gumBallMachine.getNoQuarterState());

	}

	@Override
	public void turnCrank() {
		System.out.println("손잡이를 돌리셨습니다.");
		int winner = randomWinner.nextInt(10);
		if ((winner==0) && (gumBallMachine.getCount() > 1)){
			gumBallMachine.setState(gumBallMachine.getWinnerState());
		}else{
			gumBallMachine.setState(gumBallMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("알맹이가 나갈 수 없습니다.");
	}
}
