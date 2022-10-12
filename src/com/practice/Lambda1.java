package com.practice;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Calc1 {
	int run(int a);
}

@FunctionalInterface
interface Calc2 {
	void run();
}


public class Lambda1 {

	public static void main(String[] args) {
		Calc1 c1 = (int a) -> {
			return a;
		};
		System.out.println(c1.run(5));

		Calc2 c2 = () -> System.out.println("running");
		c2.run();

     	List<Integer> l=Arrays.asList(1,2,3,4);
        l.forEach(i->System.out.println(i));

	}

}
