package com.divijish.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Pattern {

	private static Map<String, Word> colorMap = new HashMap(0);

	public static int addColor(String color) {

		if (!colorMap.containsKey(color)) {
			colorMap.put(color, new Word("Word is :"+color));
		}

		return colorMap.size();
	}

	public static int colorMapSize() {
		return colorMap.size();
	}

	public static String getColors() {
		return colorMap.toString();
	}

}
