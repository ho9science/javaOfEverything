package io.pattern.command;

public class CeilingFanOffCommand implements Command{
	CeilingFan ceilingFan;
	int prevSpeed;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		prevSpeed = ceilingFan.getSpeed();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		this.ceilingFan.off();
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
