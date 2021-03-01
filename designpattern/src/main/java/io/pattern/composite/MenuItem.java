package io.pattern.composite;

import lombok.Getter;

import java.util.Iterator;

@Getter
public class MenuItem extends MenuComponent {
	String name;
	String description;
	boolean vegetarian;
	double price;

	public MenuItem(String name,
					String description,
					boolean vegetarian,
					double price){
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public void print(){
		System.out.print("\t"+getName());
		if (isVegetarian()){
			System.out.print("(v)");
		}
		System.out.println(", "+getPrice());
		System.out.println("    -- "+getDescription());
	}

	public Iterator createIterator(){
		return new NullIterator();
	}
}
