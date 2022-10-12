package com.practice;

class Animal {
	String Ani_name;
	int Ani_age;

	public void eat() {
		System.out.println("Eating");
	}
}

class Dog extends Animal {
	public void walk() {
		System.out.println("Walking");
	}

	public void sleep() {
		System.out.println("Sleeping");
	}

}

class cat extends Dog {
	public void meow() {
		System.out.println("Meow");
	}

	public void show(String Ani_name, int Ani_age) {
		System.out.println("My name is" + " " + Ani_name);
		System.out.println("I'm am" + " " + Ani_age);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		cat d = new cat();
		d.show("Chotu", 4);
		d.walk();
		d.eat();
		d.sleep();
		d.meow();

	}
}
//---------------------------------------------------------------------------
//class Stock {
//	String s_name;
//	int s_price;
//
//	Stock() {
//		System.out.println("Stocks");
//	}
//
//	Stock(String n, int p) {
//		s_name = n;
//		s_price = p;
//		System.out.println(s_name + " " + s_price);
//	}
//}

//class Substocks extends Stock {
//	String s_name;
//	int s_price;
//	String s_type;
//
//	Substocks() {
//		System.out.println("Substocks");
//	}
//
//	Substocks(String s_n, int s_p, String s_t) {
//		s_name = s_n;
//		s_price = s_p;
//		s_type = s_t;
//	}
//
//	public void print() {
//		System.out.println(s_name + " " + s_price + " " + s_type);
//
//	}
//}
//
//public class Inheritance {
//	public static void main(String args[]) {
//		Stock s = new Stock("Hero", 50);
//		Substocks ss = new Substocks("ball", 10, "pen");
//		ss.print();
//
//	}
//}