package com.practice;

public class ThreadExampleLambda {

	public static void main(String[] args) {
		Thread t1=new Thread(()->
	     {
	        for(int i=0;i<5;i++)
	        {
	            System.out.println("say");
	        }
	    });
			Thread t2=new Thread(()->
	    {
	        for(int i=0;i<5;i++)
	        {
	            System.out.println("Show");
	        }
	    });
			t1.start();
			try{Thread.sleep(500);}
			catch(Exception e){
			}
			t2.start();
	}

}
