package com.practice;

interface Breed{
	Cook walk(String aname);
}
class Cook{
	String aname;
	int aid;
	public Cook(String aname) {
		this.aname=aname;
		//this.aid=aid;
	}
	@Override
	public String toString() {
		return "Cook [aname=" + aname + "]";
	}
	
	
}
public class MethodRef2 {

	public static void main(String[] args) {
		Breed b=Cook::new;
		System.out.println(b.walk("nhy"));
	}

}
