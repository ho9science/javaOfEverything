package io.pattern.facade;

public class HomeTheaterFacade {
	DvdPlayer dvd;
	Screen screen;
	SurroundChannel channel;

	public HomeTheaterFacade(DvdPlayer dvd,
							 Screen screen,
							 SurroundChannel channel){
		this.dvd = dvd;
		this.screen = screen;
		this.channel = channel;
	}

	public void watchMovie(String movie){
		channel.on();
		screen.on();
		dvd.on();
		dvd.play(movie);
	}

	public void endMovie(){
		channel.off();
		screen.off();

	}
}
