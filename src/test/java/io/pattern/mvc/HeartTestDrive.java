package io.pattern.mvc;

import org.junit.Test;

public class HeartTestDrive {

	@Test
	public void djTest(){
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}
	@Test
	public void test(){
		HeartModel heartModel = new HeartModel();
		ControllerInterface model = new HeartController(heartModel);
	}
}
