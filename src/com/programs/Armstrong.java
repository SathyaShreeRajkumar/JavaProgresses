package com.sample.programs;

import java.util.Scanner;


public class Armstrong {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
		int digit,sum=0;
		int temp=n;
		while(n>0)
		{
			digit=n%10;
		    sum=sum+(digit*digit*digit);
		    n/=10;
		}
		if(temp==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a Armstrong number");
		in.close();

	}

}
