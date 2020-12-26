package io.pattern.factory.abst;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	abstract void prepare();
	ArrayList toppings = new ArrayList<>();

//	void prepare(){
//		System.out.println("Preparing "+name);
//		System.out.println("Tossing dough ...");
//		System.out.println("Adding sauce ...");
//		System.out.println("Adding toppings: ");
//		for (int i = 0; i < toppings.size(); i++){
//			System.out.println(" " + toppings.get(i));
//		}
//	}

	void bake(){
		System.out.println("Bake for 25m at 350");
	}

	void cut(){
		System.out.println("cutting the pizza into diagonal slices");
	}

	void box(){
		System.out.println("place pizza in official pizzastore box");
	}

	String getName() {
		return name;
	}

	void setName(String name){
		this.name = name;
	}

	public String toString(){
		String message = name+" 피자 완성";
		return message;
	}
;}
