package com.practice;

abstract class Payroll{
	private String name;
	private int salary;

	abstract void display();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Payroll [name=" + name + ", salary=" + salary + "]";
	}

	

}

class Manager extends Payroll {
	@Override
	public void display() {
		System.out.println(getName()+" Salary "+ getSalary());
	}
}

class Employee extends Payroll {
	@Override
	public void display() {
		System.out.println(getName()+" Salary " + getSalary());
	}

	public void display(String s) {
		System.out.println(getName()+" Salary " + getSalary());
	}
}

public class SampleMock1 {

	public static void main(String[] args) {
		Payroll m = new Manager();
		m.setName("Manager");
		m.setSalary(1000000);
		m.display();

		Employee e = new Employee();
		e.setName("Employee1");
		e.setSalary(99999);
		e.display();

		e.setName("Employee2");
		e.setSalary(88888);
		e.display("");

	}

}
