package io.pattern.iterator;

import org.junit.Test;

import java.util.ArrayList;

public class MenuTestDrive {

	@Test
	public void test(){
		ArrayList menuList = new ArrayList<Menu>();
		menuList.add(new PancakeHouseMenu());
		menuList.add(new DinerMenu());
		menuList.add(new CafeMenu());
		Waitress waitress = new Waitress(menuList);
		waitress.printMenu();
	}
}
