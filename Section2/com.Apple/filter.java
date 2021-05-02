package com.Apple;

import java.util.ArrayList;
import java.util.List;

public class filter {
	// 1가지 색만 처리할 수 있는 코드
	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>(); // 사과 누적 리스트
		for (Apple apple : inventory) {
			if (Color.GREEN.equals(apple.getColor())) { // 녹색 사과만 선택
				result.add(apple);
			}
		}
		return result;
	}

	// 여러 색을 처리할 수 있는 코드
	public static List<Apple> filterApples(List<Apple> inventory, Color color) {
		List<Apple> result = new ArrayList<>(); // 사과 누적 리스트
		for (Apple apple : inventory) {
			if (color.equals(apple.getColor())) { // 입력된 특정 색 사과만 선택
				result.add(apple);
			}
		}
		return result;
	}

	// 여러 색과 여러 무게를 처리할 수 있는 코드
	public static List<Apple> filterApplesByColorAndWeight(List<Apple> inventory, Color color, int weight) {
		List<Apple> result = new ArrayList<>(); // 사과 누적 리스트
		for (Apple apple : inventory) {
			if (color.equals(apple.getColor()) && apple.getWeight() > weight) { // 특정색과, 특정 무게이상 넣기
				result.add(apple);
			}
		}
		return result;
	}
	
	//여기서 직접적으로 조건을 만드는 것이 아닌 불러와서 처리
	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>(); // 사과 누적 리스트
		for (Apple apple : inventory) {
			if (p.test(apple)) { // Predicate객체로 사과 검사 조건을 캡슐화 함.
				result.add(apple);
			}
		}
		return result;
	}

}
