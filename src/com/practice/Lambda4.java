package com.practice;

import java.util.Arrays;
import java.util.List;

interface Writable {
	void pen();
}

interface Drawable {
	String sketch(String color);

}

public class Lambda4 {
	public static void main(String... args) {
		Writable write = () -> System.out.println("Writing using pen..!!");
		write.pen();

		Drawable draw = (color) -> {
			return color;
		};
		System.out.println(draw.sketch("Sketch using Colors..!!"));

		List<Integer> li = Arrays.asList(1, 2, 3, 4);
		li.forEach(i -> System.out.println(i));
	}
}
