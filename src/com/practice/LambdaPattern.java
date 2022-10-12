package com.practice;

interface Pattern {
	void print();
}


public class LambdaPattern {

	public static void main(String[] args) {
		Pattern increasestar=()->{
			for(int i=1; i<=5; i++) {
				for(int j=1;j<=i;j++) {
		                System.out.print("*");
		            }
				System.out.println();
			}
		};
		//increasestar.print();
		
		Pattern decreasestar=()->
		{
			for(int i=5;i>=1;i--)
			{
			    for(int j=1;j<=i;j++)
			    {
			        System.out.print("*");
			    }
			    System.out.println();
			}
		};
		//decreasestar.print();
		
		Pattern decreasespace=()->
		{
			for(int i=5;i>=1;i--)
			{
			    for(int j=1;j<=i;j++)
			    {
			        System.out.print(" ");
			    }
			    System.out.println();
			}
		};
		
		increasestar.print();
		decreasestar.print();
		decreasespace.print();
	}
}
