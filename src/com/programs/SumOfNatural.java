package com.sample.programs;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfNatural {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
		sum(n);
        in.close();
	}
    static void sum(int n)
    {
    	int stream =IntStream.range(1, n+1).sum();
    	System.out.println(stream);
    }
}
