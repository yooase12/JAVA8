package com.Apple;

import java.util.ArrayList;
import java.util.List;

public class Apple {
	private int weight;
	private Color color;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + "]";
	}
	public Apple(int weight, Color color) {
		super();
		this.weight = weight;
		this.color = color;
	}

}
