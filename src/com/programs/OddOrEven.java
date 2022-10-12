package com.sample.programs;

import java.util.Arrays;
import java.util.List;

public class OddOrEven {

	public static void main(String[] args) {
//		List<Integer> li=Arrays.asList(2,3,4,6);
//		li.stream().filter(n->n%2==0).forEach(x->System.out.println(x));
		
		List<Integer> result=Arrays.asList(2,3,4,6,7);
		result.stream().filter(n->n%2!=0).forEach(x->System.out.println(x));

	}

}
