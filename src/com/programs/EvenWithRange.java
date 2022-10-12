package com.sample.programs;

import java.util.Scanner;
import java.util.stream.IntStream;

public class EvenWithRange {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int start=in.nextInt();
		int end=in.nextInt();
		evennum(start,end);
		in.close();
	}
		

     static void evennum(int start, int end) {
		 IntStream.range(start, end+1).filter(i->i%2==0).forEach(System.out::println);
		
	}
	}


