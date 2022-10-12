package com.practice;

import java.util.function.Predicate;

public class PredicateExample1 {

	public static void main(String[] args) {
		String s = "sathya";
		Predicate<String> p = new Predicate<>() {
			
			public boolean test(String s2) {
				return s.equalsIgnoreCase(s2);
			}

		};
		System.out.println(p.test("SATHYA"));
		
		Predicate<String> p1=(s1)->(s1.equals("sathya"));
		System.out.println(p1.test("Shree"));

	}

}
