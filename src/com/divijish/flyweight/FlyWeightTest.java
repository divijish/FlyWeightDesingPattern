package com.divijish.flyweight;

import java.util.Scanner;

public class FlyWeightTest {

	public static void main(String[] args) {

		System.out.println("Start");
		String color;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Please enter a word:");
						color = input.nextLine();
			System.out.println(color);
			if (!color.equalsIgnoreCase("exit")) {
				System.out.println("Size of colorMap is :" + Pattern.addColor(color.toLowerCase()));
			}

		} while (!"exit".equalsIgnoreCase(color));

		System.out.println("Total Colors: " + Pattern.getColors());

	}

}
