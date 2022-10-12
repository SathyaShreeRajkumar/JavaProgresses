package com.sample.programs;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=in.nextInt();
		System.out.println("Enter first number");
		int b=in.nextInt();
 		a=a+b;
 		b=a-b;
 		a=a-b;
 		System.out.println(a+" "+b);
	}

}
