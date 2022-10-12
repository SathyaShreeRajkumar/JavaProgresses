package com.practice;

abstract class Vehicle{
	private String engine;

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	public abstract void steer();
}
class Car extends Vehicle{

	@Override
	public void steer() {
	  System.out.println("Car steerig");
		
	}
	
}
class Bike extends Vehicle{

	@Override
	public void steer() {
	  System.out.println("Bike steering");
		
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		
         Car car1=new Car();
         car1.setEngine("hybrid");
         System.out.println(car1.getEngine());
         car1.steer();
         
         Bike bike1=new Bike();
         bike1.setEngine("electric");
        System.out.println( bike1.getEngine());
	}

}
