package com.sample.programs;

import java.util.Scanner;

class Fact{
//	static int fact(int num)
//	{
//		return (num==1 || num==0)?1:num*fact(num-1);
//	}
	static void factorial(long num)
	{
		long fact=1;
		for(int i=2;i<=num;i++)
			fact*=i;
		System.out.println(fact);
		
	}
}
public class Factorial {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		long num=in.nextInt();
		Fact.factorial(num);
		//System.out.println(Fact.fact(num));
        
	}

}
