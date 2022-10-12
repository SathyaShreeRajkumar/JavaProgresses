package com.practice;

class Computer {
	public void Dell() {
		System.out.println("Dell");
	}
}

interface Laptop {
	public void Mac();
}

public class AnonymousClass {

	public static void main(String[] args) {

		Computer comp1 = new Computer() {
			public void Dell() {
				System.out.println("It is a Dell");
			}
		};
		comp1.Dell();

		Laptop mc = new Laptop() {
			public void Mac() {
				System.out.println("It is a Mac");
			}
		};
		mc.Mac();
	}

}
