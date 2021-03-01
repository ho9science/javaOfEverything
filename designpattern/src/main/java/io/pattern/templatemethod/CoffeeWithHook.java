package io.pattern.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("brew coffee grind");
	}

	@Override
	void addCondiments() {
		System.out.println("add sugar and milk");
	}

	public boolean customWantsCondiments(){
		String answer = getUSerInput();

		if(answer.toLowerCase().startsWith("y")){
			return true;
		}else {
			return false;
		}
	}

	private String getUSerInput(){
		String answer = null;

		System.out.println("May I add milk and sugar to the coffee? (y/n) ");

		try(
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		){
			answer = in.readLine();
		} catch (IOException e) {
			System.err.println("io error");
		}
		if( answer == null){
			return "no";
		}
		return answer;
	}
}
