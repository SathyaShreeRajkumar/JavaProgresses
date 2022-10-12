package com.sample.programs;

import java.util.Scanner;

class Prime {
	static void findprime(int num) {
			int count = 0;
			for (int i = 1; i <=num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
		
			if (count == 2)
				System.out.println(num+ " is a prime number");
			else
				System.out.println(num+ " is not a prime number");
	}
}

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = in.nextInt();
		Prime.findprime(num);
		in.close();

	}

}
