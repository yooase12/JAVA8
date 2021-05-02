package com.Apple.Main;

import java.util.ArrayList;
import java.util.List;

import com.Apple.Apple;
import com.Apple.AppleGreenColorPredicate;
import com.Apple.AppleHeavyWeightPredicate;
import com.Apple.Color;
import com.Apple.filter;

public class Main {

	public static void main(String[] args) {
		List<Apple> inventory = new ArrayList<>();

		inventory.add(new Apple(9, Color.GREEN));
		inventory.add(new Apple(7, Color.RED));
		inventory.add(new Apple(2, Color.GREEN));
		inventory.add(new Apple(5, Color.GREEN));
		inventory.add(new Apple(6, Color.RED));
		inventory.add(new Apple(4, Color.RED));
		
		List<Apple> result = filter.filterGreenApples(inventory);

		for (Apple a : result) {
			System.out.println(a);
		}
		System.out.println("========빨간 사과=========");
		result = filter.filterApples(inventory, Color.RED);

		for (Apple a : result) {
			System.out.println(a);
		}
		
		System.out.println("========여러 무게=========");
		result = filter.filterApplesByColorAndWeight(inventory, Color.RED, 5);

		for (Apple a : result) {
			System.out.println(a);
		}
		
		System.out.println("========조건을 넘김=========");
		result = filter.filterApples(inventory, new AppleHeavyWeightPredicate());
		
		for (Apple a : result) {
			System.out.println(a);
		}
		System.out.println("========람다로 출력=========");
		result = filter.filterApples(inventory, (Apple apple) -> Color.RED.equals(apple.getColor()));
		
		for (Apple a : result) {
			System.out.println(a);
		}
		
		System.out.println("========람다로 출력=========");
		result = filter.filterApples(inventory, (Apple apple) -> Color.RED.equals(apple.getColor()) && apple.getWeight() > 5);
		
		for (Apple a : result) {
			System.out.println(a);
		}
	}

}
