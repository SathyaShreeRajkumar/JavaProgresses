package com.practice;

interface Runnable{
	int start();
}
class Fina{
	public void drive(Runnable obj)
	{
		int number=obj.start();
		System.out.println("number is"+number);
	}
}
public class Lambda3 {

	public static void main(String[] args) {
	   Fina c=new Fina();
	   c.drive(()->{
		   
	   System.out.println("driving");
	   return 1;
	   });
	   
		
//		Runnable r=()->System.out.println("starting");
//		r.start();

	}

}
