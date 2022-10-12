package com.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableArrayList {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("Sa");
		l1.add("Sat");
		l1.add("Sath");
		l1.add("Sathya");
		l1.forEach(i -> System.out.println(i));
		l1 = Collections.unmodifiableList(l1);
		l1.add("sathya shree");
		l1.forEach(i -> System.out.println(i));
	}

}
