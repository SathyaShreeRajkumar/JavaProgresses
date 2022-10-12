package com.sample.programs;

import java.util.Scanner;
import java.util.stream.IntStream;

public class OddWithinRange {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int start=in.nextInt();
		int end=in.nextInt();
		oddnum(start,end);
		in.close();
	}
		

     static void oddnum(int start, int end) {
		 IntStream.range(start, end).filter(i->i%2!=0).forEach(System.out::println);
		
	}
	   
	
	

}
