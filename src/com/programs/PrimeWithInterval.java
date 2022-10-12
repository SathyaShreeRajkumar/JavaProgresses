package com.sample.programs;

import java.util.Scanner;


public class PrimeWithInterval {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter start range");
		int start=in.nextInt();
		System.out.println("Enter end range");
		int end=in.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(isPrime(i)==1)
			{
				System.out.println(i+" ");
			}
		}
		in.close();
	}
	public static int isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return -1;
		}
		return 1;
	}

}
