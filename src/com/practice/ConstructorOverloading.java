package com.practice;

class Stud {
	String name;
	int mark;
	int rollNo;

	public Stud() {
		name = "Sathya";
		mark = 90;
		rollNo = 101;
	}

	public Stud(int mark) {
		this.mark = mark;
	}

	public Stud(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

	public Stud(String name, int mark, int rollNo) {
		this.name = name;
		this.mark = mark;
		this.rollNo = rollNo;
	}

	public Stud(Stud s1) {
		this.name = s1.name;
		this.mark = s1.mark;
		this.rollNo = s1.rollNo;
	}

	void display() {
		System.out.println("Mark: " + mark + " " + "Name:" + name + " " + "RollNo:" + rollNo);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Stud s = new Stud();
		s.display();
		Stud s1 = new Stud(94);
		Stud s2 = new Stud("Cringe", 94);
		Stud s3 = new Stud("Cringe", 94, 101);
		s1.display();
		s2.display();
		s3.display();
		Stud s4 = new Stud(s1);
		s4.display();

	}

}
