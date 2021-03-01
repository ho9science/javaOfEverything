package io.pattern.command;

public class CeilingFanMediumCommand implements Command{
	CeilingFan ceilingFan;
	int prevSpeed;

	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		this.ceilingFan.medium();
	}

	@Override
	public void undo() {
		if( CeilingFan.HIGH == prevSpeed){
			ceilingFan.high();
		}else if (CeilingFan.MEDIUM == prevSpeed){
			ceilingFan.medium();
		}else if (CeilingFan.LOW == prevSpeed){
			ceilingFan.low();
		}else if (CeilingFan.OFF == prevSpeed){
			ceilingFan.off();
		}
	}
}
