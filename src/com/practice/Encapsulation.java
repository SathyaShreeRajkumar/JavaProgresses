package com.practice;
class Student{
	private int roll;
	private String name;
	Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
		System.out.println(roll+" "+name);
	}
	public int getroll()
	{
		return roll;
	}
	public void setRoll(int r)
	{
		roll=r;
	}
	public String getname()
	{
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}
	public void walk()
	{
		System.out.println("Walking");
	}
	public String walk(String s)
	{
		return s;
	}
}


public class Encapsulation {

	public static void main(String[] args) {
		Student s1=new Student(10,"sanj");
		s1.setRoll(101);
		s1.setName("Shree");
		System.out.println(s1.getroll());
		System.out.println(s1.getname());
		s1.walk();
		System.out.println(s1.walk("sathya"));

	}

}
