package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class java7Code {

	public static void main(String[] args) {
		//제품 선언.
		List<Dish> menu = new ArrayList<>();
		menu.add(new Dish(350, "치킨"));
		menu.add(new Dish(300, "피자"));
		menu.add(new Dish(380, "햄버거"));
		menu.add(new Dish(700, "스테이크"));
		menu.add(new Dish(550, "돈까스"));
		menu.add(new Dish(800, "히든메뉴"));
		
		//자바 7 코드
		List<Dish> lowCaloricDishes = new ArrayList<>();
		//400보다 작은 칼로리 저장
		for(Dish dish : menu) {
			if(dish.getCalrories() < 400) {
				lowCaloricDishes.add(dish);
			}
		}
		//칼로리 순으로 정렬
		Collections.sort(lowCaloricDishes, (a, b) -> Integer.compare(a.getCalrories(), b.getCalrories()));
		//이름 저장
		List<String> lowCaloricDishesName = new ArrayList<>();
		for(Dish dish : lowCaloricDishes) {
			lowCaloricDishesName.add(dish.getName());
		}
	}

}
