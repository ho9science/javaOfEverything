package io.pattern.facade;

import org.junit.Test;

public class HomeTheaterDriveTest {
	@Test
	public void test(){
		DvdPlayer dvd = new DvdPlayer();
		Screen screen = new Screen();
		SurroundChannel channel = new SurroundChannel();
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, screen, channel);
		homeTheater.watchMovie("Inception");
		homeTheater.endMovie();

	}
}
