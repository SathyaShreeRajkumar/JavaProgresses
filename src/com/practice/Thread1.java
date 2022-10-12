package com.practice;

public class Thread1{

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(()->
		{
		  for(int i=0;i<5;i++)
		  {
			  System.out.println("hi");
			  try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  }
		},"Hi thread");
		
		Thread t2=new Thread(()->
		{
		  for(int i=0;i<5;i++)
		  {
			  System.out.println("hey");
			  try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  }
		},"Hey thread");
		
		System.out.println(t1.getName()+" "+t1.getPriority());
		System.out.println(t2.getName()+" "+t2.getPriority());
		t1.start();
		Thread.sleep(100);
		t2.start();
		
		t1.join();
		System.out.println("hello");
	}

}
