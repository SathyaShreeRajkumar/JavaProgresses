package com.sample.programs;

import java.util.Scanner;

public class RecursionFactorial {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
        System.out.println(fact(n));
        in.close();
	}
	
	static int fact(int n)
	{
		if(n==0)
			return 1;
		return n*fact(n-1);
	}


}
