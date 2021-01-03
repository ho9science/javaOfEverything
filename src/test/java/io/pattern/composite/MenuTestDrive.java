package io.pattern.composite;

import org.junit.Test;

public class MenuTestDrive {
	@Test
	public void showMenus(){
		MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
		MenuComponent dinerMenu = new Menu("식당 메뉴", "점심 메뉴");
		MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
		MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨보세요!");

		MenuComponent allMenus = new Menu("전체메뉴", "전체메뉴");

		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		allMenus.add(dessertMenu);

		dinerMenu.add(new MenuItem("파스타","마리나라 소스스파게티, 효모빵도 드립니다.", true, 3.89));

		dessertMenu.add(new MenuItem("애플 파이", "바삭바삭한 크러스트에 바닐라 이스크림이 얹혀 있는 애플 파이", true, 1.59));

		Waitress waitress = new Waitress(allMenus);

		waitress.printMenu();
	}

	@Test
	public void showVegetarianMenu(){
		MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
		MenuComponent dinerMenu = new Menu("식당 메뉴", "점심 메뉴");
		MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
		MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨보세요!");

		MenuComponent allMenus = new Menu("전체메뉴", "전체메뉴");

		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		allMenus.add(dessertMenu);

		dinerMenu.add(new MenuItem("파스타","마리나라 소스스파게티, 효모빵도 드립니다.", true, 3.89));

		dessertMenu.add(new MenuItem("애플 파이", "바삭바삭한 크러스트에 바닐라 이스크림이 얹혀 있는 애플 파이", true, 1.59));

		Waitress waitress = new Waitress(allMenus);

		waitress.printVegetarianMenu();
	}
}
