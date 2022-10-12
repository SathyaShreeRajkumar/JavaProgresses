package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

interface Operable{
	void display();
}
class Operator{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public void show() {
		System.out.println("Displaying");
	}
}
public class MethodRef1 {

	public static void main(String[] args) {
		  //using lambda
		Function<String,String> Lamfun=(String s)->s.toLowerCase();
		System.out.println(Lamfun.apply("SATHYA"));
		
		  //using method reference
		Function<String,String> reffun= String::toLowerCase;
		System.out.println(reffun.apply("SHREE"));
		
		BiFunction<Integer,Integer,Integer> infun= Operator::add;
		System.out.println(infun.apply(3,5));
		
		Operator opr=new Operator();
		Operable op=opr::show;
		op.display();
		
		List<String> names=new ArrayList<>();
		names.add("Lion");
		names.add("Tiger");
		names.add("Dog");
		names.add("Cat");
		
		List<String> sorted=names.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(sorted);
		
		
	}

}
