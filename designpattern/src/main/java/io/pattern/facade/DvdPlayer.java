package io.pattern.facade;

public class DvdPlayer {
	public void on(){
		System.out.println("dvd player on");
	}

	public void play(String movie){
		System.out.println("dvd player play \""+movie+"\"");
	}

	public void off(){
		System.out.println("dvd player off");
	}
}
