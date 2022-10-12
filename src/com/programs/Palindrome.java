package com.sample.programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=in.nextInt();
		int rev,sum=0;
		int temp=num;
		while(num>0)
		{
			rev=num%10;
			sum=(sum*10)+rev;
			num/=10;
		}
		if(temp==sum)
		{
			System.out.println("Palidrome number");
		}
		else
		{
			System.out.println("Not a Palidrome number");
		}
		in.close();

	}

}
