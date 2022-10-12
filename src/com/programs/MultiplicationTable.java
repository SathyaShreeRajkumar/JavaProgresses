package com.sample.programs;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
		multiply(n);
        in.close();
	}
	static void multiply(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+ " * "+ i + " = "+ n*i);
		}
	}

}
