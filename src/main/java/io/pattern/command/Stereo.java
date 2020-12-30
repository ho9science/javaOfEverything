package io.pattern.command;

public class Stereo {
	private String name;
	private int volume;

	public Stereo(String name){
		this.name = name;
	}
	public void on(){
		System.out.println("stereo is on");
	}
	public void off(){
		System.out.println("stereo is off");
	}

	public void setCD(){
		System.out.println("CD input");
	}

	public void setVolume(int volume){
		System.out.println("stereo volumne set to "+volume);
		this.volume = volume;
	}
}
