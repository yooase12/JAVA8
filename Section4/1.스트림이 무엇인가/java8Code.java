package study;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class java8Code {

	public static void main(String[] args) {
		//제품 선언.
		List<Dish> menu = new ArrayList<>();
		menu.add(new Dish(350, "치킨"));
		menu.add(new Dish(300, "피자"));
		menu.add(new Dish(380, "햄버거"));
		menu.add(new Dish(700, "스테이크"));
		menu.add(new Dish(550, "돈까스"));
		menu.add(new Dish(800, "히든메뉴"));
		
		//자바 8 코드
		List<String> lowCaloricDishesName =
				menu.parallelStream()
					.filter(d -> d.getCalrories() < 400) //400 칼로리 이하의 요리 선택
					.sorted(Comparator.comparing(Dish::getCalrories)) //칼로리로 요리 정렬
					.map(Dish::getName) //요리명 추출
					.collect(Collectors.toList()); //모든 요리명을 리스트에 저장
		for(String name : lowCaloricDishesName) {
			System.out.println(name);
		}
		
	}

}
