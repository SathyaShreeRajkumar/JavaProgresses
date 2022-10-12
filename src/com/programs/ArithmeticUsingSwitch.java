package com.sample.programs;

import java.util.Scanner;

class Arithmetic {
	static int operator(int num1, int num2, char ch) {
		return switch (ch) {
		case '+' -> num1 + num2;
		case '-' -> num1 - num2;
		case '*' -> num1 * num2;
		case '/' -> num1 / num2;
		default -> throw new IllegalArgumentException("Unexpected operator: " + ch);
		};
	}
}

public class ArithmeticUsingSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("First number:");
		int num1 = in.nextInt();
		System.out.println("Second number:");
		int num2 = in.nextInt();
		System.out.println("Choose an operator (+,-,*,/)");
		char ch = in.next().charAt(0);
		System.out.println(Arithmetic.operator(num1, num2, ch));
        in.close();
	}

}
