package com.practice;

class AB extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
        System.out.println("Say");
        try{Thread.sleep(500);}
        catch(Exception e){}
        }
    }
}
class ABC extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
        System.out.println("Show");
        try{Thread.sleep(500);}
        catch(Exception e){}
        }
    }
}
public class ThreadExample1 {

	public static void main(String[] args) {
			   AB a1=new AB();
			   ABC b1=new ABC();
			   a1.start();
			   try{Thread.sleep(50);}
		        catch(Exception e){}
			   b1.start();
	}

}
