package io.pattern.decorator.beverage;

public abstract class Beverage {
	String description = "제목 없음";

	Size size = Size.TALL;

	public enum Size {
		TALL, GRANDE, VENTI;
	}

	public String getDescription(){
		return description;
	}

	public Beverage.Size getSize(){
		return this.size;
	}

	public void setSize(Beverage.Size size){
		this.size = size;
	}

	public abstract double cost();
}
