package com.divijish.flyweight;

public class Word {

	private String color;

	Word(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Color [color=" + color + "]";
	}

}
