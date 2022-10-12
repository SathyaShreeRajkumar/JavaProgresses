package com.sample.programs;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		StringBuilder str=new StringBuilder(s);
		StringBuilder s1=str.reverse();
		String s2=s1.toString();
		System.out.println(Integer.parseInt(s2));
		
	}

}

