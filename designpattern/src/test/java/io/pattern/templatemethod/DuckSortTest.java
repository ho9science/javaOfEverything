package io.pattern.templatemethod;

import org.junit.Test;

import java.util.Arrays;

public class DuckSortTest {
	@Test
	public void sortDuckTest(){
		Duck[] duck = {
			new Duck("Daffy", 8),
			new Duck("Dewey", 2),
			new Duck("Howard", 7),
			new Duck("Louie", 2),
			new Duck("Donald", 10),
			new Duck("Huey", 2)
		};

		System.out.println("not sort");
		display(duck);

		Arrays.sort(duck);

		System.out.println("\nafter sorting: ");
		display(duck);
	}

	public static void display(Duck[] ducks){
		for (Duck duck : ducks){
			System.out.println(duck);
		}
	}
}
