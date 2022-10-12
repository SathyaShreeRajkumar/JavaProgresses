package com.sample.programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=0,c=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
		System.out.println("Fibonacci: ");
		for(int i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
		
	}

}
