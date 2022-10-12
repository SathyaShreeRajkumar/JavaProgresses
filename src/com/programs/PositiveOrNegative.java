package com.sample.programs;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=in.nextInt();
		if(num>0)
		{
		    System.out.println("positive");
		}
		else if(num<0)
		{
		     System.out.println("negative");
		}
		else{
		     System.out.println("zero");
		}
		in.close();

	}

}
