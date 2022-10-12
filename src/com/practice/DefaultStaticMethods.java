package com.practice;

@FunctionalInterface
interface Bank {
	void username();

	default void pswrd() {
		System.out.println("Password please?");
	}

	static void accno() {
		System.out.println("Oops acc no please?");
	}
}
class SBI implements Bank {

	@Override
	public void username() {
		System.out.println("Im the user");
	}

	@Override
	public void pswrd() {
		System.out.println("Confirm password");
	}
}

public class DefaultStaticMethods {
	public static void main(String... args) {
		Bank bank = new SBI();
		bank.username();
		bank.pswrd();
     	Bank.accno();

	}
}
