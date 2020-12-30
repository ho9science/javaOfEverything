package io.pattern.command;

import org.junit.Test;

public class RemoteControlTest {
	@Test
	public void test(){
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light("simple light");
		LightOnCommand lightOn = new LightOnCommand(light);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	}
}
